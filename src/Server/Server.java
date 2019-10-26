package Server;

import java.net.DatagramPacket;

import java.net.DatagramSocket;

import java.net.InetAddress;

public class Server {
    public static String getWeather(String location){
        return "";
    }
    public static void main(String args[]) throws Exception {
        //khởi động udp server với port 8000

        DatagramSocket socket = new DatagramSocket(8000);

        System.out.println("server is running");

        //tạo chuỗi byte

        byte[] inServer = new byte[1024];

        byte[] outServer = new byte[1024];

        //tạo packet nhận dữ liệu

        DatagramPacket rcvPkt = new DatagramPacket(inServer, inServer.length);

        while (true) {

            // chờ nhận dữ liệu từ client

            socket.receive(rcvPkt);
            
            String data = new String(rcvPkt.getData());
            
            
            //gửi dữ liệu lại cho client
            String result = "";
            outServer = result.getBytes();

            InetAddress IP = rcvPkt.getAddress();
            int port = rcvPkt.getPort();
            DatagramPacket sndPkt = new DatagramPacket(outServer, outServer.length, IP, port);

            socket.send(sndPkt);

        }

    }

}