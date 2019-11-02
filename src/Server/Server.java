package Server;

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

public class Server {

    public static String getWeather(String location) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("./src/countryVN.json")));
            JSONParser parser = new JSONParser();
            JSONArray data = (JSONArray) parser.parse(content);
            JSONObject resultData = null;
            for (Object item : data) {
                JSONObject obj = (JSONObject) item;
                if (((String) obj.get("name")).indexOf(location) > -1) {
                    resultData = obj;
                }
            };
            if (resultData == null) {
                return "{\"success\":true}";
            }
            URL url = new URL("http://api.openweathermap.org/data/2.5/forecast?appid=b807789d6524ad85376b5961cc402be8&id=" + resultData.get("id").toString());
            content = "";
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
                for (String line; (line = reader.readLine()) != null;) {
                    content += line;
                }
            }
            return content;
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
            return content;
        } catch (Exception ex) {
            System.out.println(ex);
            return "{\"success\":false}";
        }
    }

    public static String getPortOpen(String IP,String x,String y) {
        String data = "";
        if(x.isEmpty() || y.isEmpty())
            return "{\"success\":false,\"error_message\":\"start port or end port is missing\"}";
        if(Integer.parseInt(x) > Integer.parseInt(y))
            return "{\"success\":false,\"error_message\":\"start port is greater than end port\"}";
        for (int port = Integer.parseInt(x); port <= Integer.parseInt(y); port++) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(IP, port), 500);
                socket.close();
                data += port+","; 
            } catch (Exception ex) {
            }
        }
        if(data.length()>0){
            data = data.substring(0, data.length() - 1);
            String[] portList = data.split(",");
            String result = "{"
                    + "\"success\":true,"
                    + "\"data\":"+Arrays.toString(portList)
                    +"}";
            return result;
        }
        return "{\"success\":true,\"data\":[]}";
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
            String result = "{}";
            if (data.indexOf("weather") > -1) {
                result = getWeather(data.split(":")[1]);
            }
            if (data.indexOf("ip") > -1) {
                result = getIPLocation(data.split(":")[1]);
            }
            if (data.indexOf("port") > -1) {
                result = getPortOpen(data.split(":")[1],data.split(":")[2],data.split(":")[3]);
            }

            //gửi dữ liệu lại cho client
            byte[] outServer = new byte[1024];
            outServer = result.getBytes();
            DatagramPacket sndPkt = new DatagramPacket(outServer, outServer.length, rcvPkt.getAddress(), rcvPkt.getPort());

            socket.send(sndPkt);

        }

    }

}
