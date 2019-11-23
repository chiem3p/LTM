package Server;

import RSA.AES;
import RSA.RSA;
import RSA.RSA_Key;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Server {

    public static String getWeather(String location) {
            location = Server.removeAccent(location).toUpperCase();
        try {
            String content = new String(Files.readAllBytes(Paths.get("./src/countryVN.json")));
            JSONParser parser = new JSONParser();
            JSONArray data = (JSONArray) parser.parse(content);
            JSONObject resultData = null;
            for (Object item : data) {
                JSONObject obj = (JSONObject) item;
                if (((String) obj.get("name_standard")).indexOf(location) > -1) {
                    resultData = obj;
                }
            };
            if (resultData == null) {
                return "{\"success\":false}";
            }
            URL url = new URL("http://api.openweathermap.org/data/2.5/forecast?appid=b807789d6524ad85376b5961cc402be8&units=metric&id=" + resultData.get("id").toString());
            content = "";
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
                for (String line; (line = reader.readLine()) != null;) {
                    content += line;
                }
            }
            return "{\"success\":true,\"data\":"+content+"}";
        } catch (Exception ex) {
            System.out.println(ex);
            return "{\"success\":false}";
        }
    }

    public static String getIPLocation(String IP) {
        try {
            URL url = new URL("https://api.ip2location.com/v2/?key=KNGRKJLPGS&package=WS12&ip=" + IP);
            String content = "";
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
                for (String line; (line = reader.readLine()) != null;) {
                    content += line;
                }
            }
            if(content.contains("Invalid IP address")){
                throw new Exception("Invalid IP adress");
            }
            return "{\"success\":true,\"data\":"+content+"}";
        } catch (Exception ex) {
            System.out.println(ex);
            return "{\"success\":false,\"error_message\":\""+ex+"\"}";
        }
    }

    public static String getPortOpen(String IP, String x, String y) {
        String data = "";
        if (x.isEmpty() || y.isEmpty()) {
            return "{\"success\":false,\"error_message\":\"start port or end port is missing\"}";
        }
        if (Integer.parseInt(x) > Integer.parseInt(y)) {
            return "{\"success\":false,\"error_message\":\"start port is greater than end port\"}";
        }
        String output = "";
        System.out.println("Start process nmap");
        try {
            Process process = Runtime.getRuntime().exec("\"C:\\Program Files (x86)\\Nmap\\nmap.exe\" -sT -sU -p " + x + "-" + y + " -d " + IP);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output += "\n" + line;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Process done");
        final Pattern pattern = Pattern.compile("(\\d+)\\/(\\w{2}p)\\s+open(?:\\|filtered)*\\s+(\\w+)");
        Matcher matcher = pattern.matcher(output);
        while (matcher.find()) {
            data+= "{"+
                        "\"port\":" + matcher.group(1)+","+
                        "\"protocol\":\"" + matcher.group(2)+"\","+
                        "\"service\":\"" + matcher.group(3)+"\""+
                    "},";
        }
//        for (int port = Integer.parseInt(x); port <= Integer.parseInt(y); port++) {
//            try {
//                Socket socket = new Socket();
//                socket.connect(new InetSocketAddress(IP, port), 500);
//                socket.close();
//                data += port + ",";
//            } catch (Exception ex) {
//            }
//        }
        if (data.length() > 0) {
            data = data.substring(0, data.length() - 1);
            String[] portList = data.split(",");
            String portStr = "";
            for(String i:portList){
                portStr +=i+",";
            }
            String result = "{"
                    + "\"success\":true,"
                    + "\"data\":" + "[" +portStr + "]"
                    + "}";
            System.out.println(result);
            return result;
        }
        return "{\"success\":false,\"error_message\":\"Không có port nào đang mở hoặc không thể kết nối đến host này\"}";
    }

    public static void main(String args[]) throws Exception {
        //khởi động udp server với port 8000
        DatagramSocket socket = new DatagramSocket(8000);

        System.out.println("server is running");

        //tạo chuỗi byte
        byte[] inServer = new byte[1024];

        //tạo packet nhận dữ liệu
        DatagramPacket rcvPkt = new DatagramPacket(inServer, inServer.length);
        while (true) {

            // chờ nhận dữ liệu từ client
            socket.receive(rcvPkt);

            String data = new String(rcvPkt.getData(), 0, rcvPkt.getLength());
            JSONParser parser = new JSONParser();
            JSONObject request = (JSONObject) parser.parse(data);
            String key = request.get("secret_key").toString();
            key = RSA.decrypt(key);
            data = AES.decrypt(request.get("data").toString(), key);
            
            String result = "{}";
            if (data.indexOf("weather") > -1) {
                result = getWeather(data.split(":")[1]);
            }
            if (data.indexOf("ip") > -1) {
                result = getIPLocation(data.split(":")[1]);
            }
            if (data.indexOf("port") > -1) {
                result = getPortOpen(data.split(":")[1], data.split(":")[2], data.split(":")[3]);
            }
            JSONObject response = new JSONObject();
            result = AES.encrypt(result, key);
            response.put("data",result);
            //gửi dữ liệu lại cho client
            byte[] outServer = new byte[1024];
            outServer = response.toString().getBytes();
            DatagramPacket sndPkt = new DatagramPacket(outServer, outServer.length, rcvPkt.getAddress(), rcvPkt.getPort());

            socket.send(sndPkt);

        }

    }
    public static String removeAccent(String text) {
        text  = Server.toUnicodeToHop(text);
        String[] chars = {"a", "A", "e", "E", "o", "O", "u", "U", "i", "I", "d", "D", "y", "Y"};
        String[][] uni = new String[14][21];
        uni[0]  = new String[] {"á", "á", "à", "ạ", "ạ", "ả", "ả", "ã", "â", "ấ", "ầ", "ậ", "ẩ", "ẫ", "ă", "ắ", "ắ", "ằ", "ặ", "ẳ", "� �"};
        uni[1]  = new String[] {"Á", "À", "Ạ", "Ả", "Ã", "Â", "Ấ", "Ầ", "Ậ", "Ẩ", "Ẫ", "Ă", "Ắ", "Ằ", "Ặ", "Ẳ", "� �"};
        uni[2]  = new String[] {"é", "è", "ẹ", "ẹ", "ệ", "ẻ", "ẽ", "ê", "ế", "ế", "ề", "ệ", "ể", "ễ"};
        uni[3]  = new String[] {"É", "È", "Ẹ", "Ẻ", "Ẽ", "Ê", "Ế", "Ề", "Ệ", "Ể", "Ễ"};
        uni[4]  = new String[] {"ó", "ò", "ò", "ọ", "ỏ", "õ", "ô", "ố", "ồ", "ồ", "ộ", "ổ", "ỗ", "ơ", "ớ", "ờ", "ợ", "ở", "ỡ", "� �"};
        uni[5]  = new String[] {"Ó", "Ò", "Ọ", "Ỏ", "Õ", "Ô", "Ố", "Ồ", "Ồ", "Ộ", "Ổ", "Ỗ", "Ơ", "Ớ", "Ờ", "Ợ", "Ở", "Ỡ", "� �"};
        uni[6]  = new String[] {"ú", "ù", "ụ", "ủ", "ủ", "ũ", "ư", "ứ", "ừ", "ự", "ử", "ữ"};
        uni[7]  = new String[] {"Ú", "Ù", "Ụ", "Ủ", "Ủ", "Ũ", "Ư", "Ứ", "Ừ", "Ự", "Ử", "Ữ"};
        uni[8]  = new String[] {"í", "ì", "ì", "ị", "ỉ", "ĩ"};
        uni[9]  = new String[] {"Í", "Ì", "Ì", "Ị", "Ỉ", "Ĩ"};
        uni[10] = new String[] {"đ", "ð"};
        uni[11] = new String[] {"Đ", "Ð"};
        uni[12] = new String[] {"ý", "ỳ", "ỵ", "ỷ", "ỹ"};
        uni[13] = new String[] {"Y", "Ỳ", "Ỵ", "Ỷ", "Ỹ"};

        for (int i =0;i<14;i++) {
            for(int j=0;j<uni[i].length;j++){
                text = text.replace(uni[i][j], chars[i]);
            }
        }
        return text;
    }
    public static String toUnicodeToHop(String str) {
        str = str.replace("á", "á");
        str = str.replace("à", "à");
        str = str.replace("ả", "ả");
        str = str.replace("ã", "ã");
        str = str.replace("ạ", "ạ");
        str = str.replace("ă", "ă");
        str = str.replace("ắ", "ắ");
        str = str.replace("ằ", "ằ");
        str = str.replace("ẳ", "ẳ");
        str = str.replace("ẵ", "ẵ");
        str = str.replace("ặ", "ặ");
        str = str.replace("â", "â");
        str = str.replace("ấ", "ấ");
        str = str.replace("ầ", "ầ");
        str = str.replace("ẩ", "ẩ");
        str = str.replace("ậ", "ậ");
        str = str.replace("ẫ", "ẫ");
        str = str.replace("ó", "ó");
        str = str.replace("ò", "ò");
        str = str.replace("ỏ", "ỏ");
        str = str.replace("õ", "õ");
        str = str.replace("ọ", "ọ");
        str = str.replace("ô", "ô");
        str = str.replace("ố", "ố");
        str = str.replace("ồ", "ồ");
        str = str.replace("ổ", "ổ");
        str = str.replace("ỗ", "ỗ");
        str = str.replace("ộ", "ộ");
        str = str.replace("ơ", "ơ");
        str = str.replace("ớ", "ớ");
        str = str.replace("ờ", "ờ");
        str = str.replace("ở", "ở");
        str = str.replace("ỡ", "ỡ");
        str = str.replace("ợ", "ợ");
        str = str.replace("ú", "ú");
        str = str.replace("ù", "ù");
        str = str.replace("ủ", "ủ");
        str = str.replace("ũ", "ũ");
        str = str.replace("ụ", "ụ");
        str = str.replace("ư", "ư");
        str = str.replace("ứ", "ứ");
        str = str.replace("ừ", "ừ");
        str = str.replace("ử", "ử");
        str = str.replace("ự", "ự");
        str = str.replace("ữ", "ữ");
        str = str.replace("é", "é");
        str = str.replace("è", "è");
        str = str.replace("ẻ", "ẻ");
        str = str.replace("ẽ", "ẽ");
        str = str.replace("ẹ", "ẹ");
        str = str.replace("ê", "ê");
        str = str.replace("ế", "ế");
        str = str.replace("ề", "ề");
        str = str.replace("ể", "ể");
        str = str.replace("ễ", "ễ");
        str = str.replace("ệ", "ệ");
        str = str.replace("í", "í");
        str = str.replace("ì", "ì");
        str = str.replace("ỉ", "ỉ");
        str = str.replace("ĩ", "ĩ");
        str = str.replace("ị", "ị");
        str = str.replace("ý", "ý");
        str = str.replace("ỳ", "ỳ");
        str = str.replace("ỷ", "ỷ");
        str = str.replace("ỹ", "ỹ");
        str = str.replace("ỵ", "ỵ");
        str = str.replace("đ", "đ");

        // Capital","",","
        str = str.replace("Á", "Á");
        str = str.replace("À", "À");
        str = str.replace("Ả", "Ả");
        str = str.replace("Ã", "Ã");
        str = str.replace("Ạ", "Ạ");
        str = str.replace("Ă", "Ă");
        str = str.replace("Ắ", "Ắ");
        str = str.replace("Ằ", "Ằ");
        str = str.replace("Ẳ", "Ẳ");
        str = str.replace("Ẵ", "Ẵ");
        str = str.replace("Ặ", "Ặ");
        str = str.replace("Â", "Â");
        str = str.replace("Ấ", "Ấ");
        str = str.replace("Ầ", "Ầ");
        str = str.replace("Ẩ", "Ẩ");
        str = str.replace("Ậ", "Ậ");
        str = str.replace("Ẫ", "Ẫ");
        str = str.replace("Ó", "Ó");
        str = str.replace("Ò", "Ò");
        str = str.replace("Ỏ", "Ỏ");
        str = str.replace("Õ", "Õ");
        str = str.replace("Ọ", "Ọ");
        str = str.replace("Ô", "Ô");
        str = str.replace("Ố", "Ố");
        str = str.replace("Ồ", "Ồ");
        str = str.replace("Ổ", "Ổ");
        str = str.replace("Ỗ", "Ỗ");
        str = str.replace("Ộ", "Ộ");
        str = str.replace("Ơ", "Ơ");
        str = str.replace("Ớ", "Ớ");
        str = str.replace("Ờ", "Ờ");
        str = str.replace("Ở", "Ở");
        str = str.replace("Ỡ", "Ỡ");
        str = str.replace("Ợ", "Ợ");
        str = str.replace("Ú", "Ú");
        str = str.replace("Ù", "Ù");
        str = str.replace("Ủ", "Ủ");
        str = str.replace("Ũ", "Ũ");
        str = str.replace("Ụ", "Ụ");
        str = str.replace("Ư", "Ư");
        str = str.replace("Ứ", "Ứ");
        str = str.replace("Ừ", "Ừ");
        str = str.replace("Ử", "Ử");
        str = str.replace("Ữ", "Ữ");
        str = str.replace("Ự", "Ự");
        str = str.replace("É", "É");
        str = str.replace("È", "È");
        str = str.replace("Ẻ", "Ẻ");
        str = str.replace("Ẽ", "Ẽ");
        str = str.replace("Ẹ", "Ẹ");
        str = str.replace("Ê", "Ê");
        str = str.replace("Ế", "Ế");
        str = str.replace("Ề", "Ề");
        str = str.replace("Ể", "Ể");
        str = str.replace("Ễ", "Ễ");
        str = str.replace("Ệ", "Ệ");
        str = str.replace("Í", "Í");
        str = str.replace("Ì", "Ì");
        str = str.replace("Ỉ", "Ỉ");
        str = str.replace("Ĩ", "Ĩ");
        str = str.replace("Ị", "Ị");
        str = str.replace("Ý", "Ý");
        str = str.replace("Ỳ", "Ỳ");
        str = str.replace("Ỷ", "Ỷ");
        str = str.replace("Ỹ", "Ỹ");
        str = str.replace("Ỵ", "Ỵ");
        str = str.replace("Đ", "Đ");

        //UTF-7","",","
        str = str.replace("á", "á");
        str = str.replace("à", "à");
        str = str.replace("ả", "ả");
        str = str.replace("ã", "ã");
        str = str.replace("ạ", "ạ");
        str = str.replace("ă", "ă");
        str = str.replace("ắ", "ắ");
        str = str.replace("ằ", "ằ");
        str = str.replace("ẳ", "ẳ");
        str = str.replace("ẵ", "ẵ");
        str = str.replace("ặ", "ặ");
        str = str.replace("â", "â");
        str = str.replace("ấ", "ấ");
        str = str.replace("ầ", "ầ");
        str = str.replace("ẩ", "ẩ");
        str = str.replace("ậ", "ậ");
        str = str.replace("ẫ", "ẫ");
        str = str.replace("ó", "ó");
        str = str.replace("ò", "ò");
        str = str.replace("ỏ", "ỏ");
        str = str.replace("õ", "õ");
        str = str.replace("ọ", "ọ");
        str = str.replace("ô", "ô");
        str = str.replace("ố", "ố");
        str = str.replace("ồ", "ồ");
        str = str.replace("ổ", "ổ");
        str = str.replace("ỗ", "ỗ");
        str = str.replace("ộ", "ộ");
        str = str.replace("ơ", "ơ");
        str = str.replace("ớ", "ớ");
        str = str.replace("ờ", "ờ");
        str = str.replace("ở", "ở");
        str = str.replace("ỡ", "ỡ");
        str = str.replace("ợ", "ợ");
        str = str.replace("ú", "ú");
        str = str.replace("ù", "ù");
        str = str.replace("ủ", "ủ");
        str = str.replace("ũ", "ũ");
        str = str.replace("ụ", "ụ");
        str = str.replace("ư", "ư");
        str = str.replace("ứ", "ứ");
        str = str.replace("ừ", "ừ");
        str = str.replace("ử", "ử");
        str = str.replace("ự", "ự");
        str = str.replace("ữ", "ữ");
        str = str.replace("é", "é");
        str = str.replace("è", "è");
        str = str.replace("ẻ", "ẻ");
        str = str.replace("ẽ", "ẽ");
        str = str.replace("ẹ", "ẹ");
        str = str.replace("ê", "ê");
        str = str.replace("ế", "ế");
        str = str.replace("ề", "ề");
        str = str.replace("ể", "ể");
        str = str.replace("ễ", "ễ");
        str = str.replace("ệ", "ệ");
        str = str.replace("í", "í");
        str = str.replace("ì", "ì");
        str = str.replace("ỉ", "ỉ");
        str = str.replace("ĩ", "ĩ");
        str = str.replace("ị", "ị");
        str = str.replace("ý", "ý");
        str = str.replace("ỳ", "ỳ");
        str = str.replace("ỷ", "ỷ");
        str = str.replace("ỹ", "ỹ");
        str = str.replace("ỵ", "ỵ");
        str = str.replace("đ", "đ");

        str = str.replace("Á", "Á");
        str = str.replace("À", "À");
        str = str.replace("Ả", "Ả");
        str = str.replace("Ã", "Ã");
        str = str.replace("Ạ", "Ạ");
        str = str.replace("Ă", "Ă");
        str = str.replace("Ắ", "Ắ");
        str = str.replace("Ằ", "Ằ");
        str = str.replace("Ẳ", "Ẳ");
        str = str.replace("Ẵ", "Ẵ");
        str = str.replace("Ặ", "Ặ");
        str = str.replace("Â", "Â");
        str = str.replace("Ấ", "Ấ");
        str = str.replace("Ầ", "Ầ");
        str = str.replace("Ẩ", "Ẩ");
        str = str.replace("Ậ", "Ậ");
        str = str.replace("Ẫ", "Ẫ");
        str = str.replace("Ó", "Ó");
        str = str.replace("Ò", "Ò");
        str = str.replace("Ỏ", "Ỏ");
        str = str.replace("Õ", "Õ");
        str = str.replace("Ọ", "Ọ");
        str = str.replace("Ô", "Ô");
        str = str.replace("Ố", "Ố");
        str = str.replace("Ồ", "Ồ");
        str = str.replace("Ổ", "Ổ");
        str = str.replace("Ỗ", "Ỗ");
        str = str.replace("Ộ", "Ộ");
        str = str.replace("Ơ", "Ơ");
        str = str.replace("Ớ", "Ớ");
        str = str.replace("Ờ", "Ờ");
        str = str.replace("Ở", "Ở");
        str = str.replace("Ỡ", "Ỡ");
        str = str.replace("Ợ", "Ợ");
        str = str.replace("Ú", "Ú");
        str = str.replace("Ù", "Ù");
        str = str.replace("Ủ", "Ủ");
        str = str.replace("Ũ", "Ũ");
        str = str.replace("Ụ", "Ụ");
        str = str.replace("Ư", "Ư");
        str = str.replace("Ứ", "Ứ");
        str = str.replace("Ừ", "Ừ");
        str = str.replace("Ử", "Ử");
        str = str.replace("Ữ", "Ữ");
        str = str.replace("Ự", "Ự");
        str = str.replace("É", "É");
        str = str.replace("È", "È");
        str = str.replace("Ẻ", "Ẻ");
        str = str.replace("Ẽ", "Ẽ");
        str = str.replace("Ẹ", "Ẹ");
        str = str.replace("Ê", "Ê");
        str = str.replace("Ế", "Ế");
        str = str.replace("Ề", "Ề");
        str = str.replace("Ể", "Ể");
        str = str.replace("Ễ", "Ễ");
        str = str.replace("Ệ", "Ệ");
        str = str.replace("Í", "Í");
        str = str.replace("Ì", "Ì");
        str = str.replace("Ỉ", "Ỉ");
        str = str.replace("Ĩ", "Ĩ");
        str = str.replace("Ị", "Ị");
        str = str.replace("Ý", "Ý");
        str = str.replace("Ỳ", "Ỳ");
        str = str.replace("Ỷ", "Ỷ");
        str = str.replace("Ỹ", "Ỹ");
        str = str.replace("Ỵ", "Ỵ");
        str = str.replace("Đ", "Đ");
        return str;
    }
}
