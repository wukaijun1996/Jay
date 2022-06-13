package src.网络Socket_TCP_UDP;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * UDPd协议的网络编程
 *
 * @Time : 2022/6/13 21:14
 * @Author : wu
 * @File : w04_UDPTest.java
 * @Software: IntelliJ IDEA
 */
public class w04_UDPTest {

    @Test
    public void sender() throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket();

        String str = "我是UDP方式发送的导弹";
        byte[] data = str.getBytes();
        InetAddress inetAddress = InetAddress.getLocalHost();
        DatagramPacket datagramPacket = new DatagramPacket(data,0,data.length,inetAddress,9090);

        datagramSocket.send(datagramPacket);

        datagramSocket.close();

    }

    @Test
    public void receiver() throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(9090);

        byte[] buffer = new byte[100];

        DatagramPacket datagramPacket = new DatagramPacket(buffer,0,buffer.length);

        datagramSocket.receive(datagramPacket);

        System.out.println(new String(datagramPacket.getData(), 0, buffer.length));

        datagramSocket.close();

    }



}
