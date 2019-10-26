package Client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

public class Client {

    public byte[] inData = new byte[102400];
    public byte[] outData = new byte[1024];
    public String host;
    public int port;

    public Client(String host, int port) {
        this.host = host;
        this.port = port;
    }
    public Client() {
        this.host = "localhost";
        this.port = 8000;
    }

    public JSONObject getWeather(String location) {
        String data = "weather:" + location;
        return this.sendData(data);
    }

    public JSONObject sendData(String data) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress IP = InetAddress.getByName(this.host);
            this.outData = data.getBytes();
            //gửi dữ liệu tới server udp
            DatagramPacket sendPkt = new DatagramPacket(this.outData, this.outData.length, IP, this.port);

            socket.send(sendPkt);
            socket.setSoTimeout(10000);
            //chờ nhận dữ liệu từ udp server gửi về
            DatagramPacket recievePkt = new DatagramPacket(this.inData, this.inData.length);
            socket.receive(recievePkt);
            String strReceived =  new String(recievePkt.getData(),0,recievePkt.getLength());
            JSONParser parser = new JSONParser();
            JSONObject result = (JSONObject) parser.parse(strReceived);
            return result;
        } catch (Exception e) {
            JSONObject result = new JSONObject();
            result.put("success",false);
            return result;
        }
    }
}
