package src.网络Socket_TCP_UDP;

/**
 * @Time : 2022/6/13 20:34
 * @Author : wu
 * @File : w03_TCPTest2.java
 * @Software: IntelliJ IDEA
 */

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/*
客户端发送文件给服务端，服务端将文件保存到本地
 */
public class w03_TCPTest2 {

    @Test
    public void client() throws IOException {

        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);

        OutputStream outputStream = socket.getOutputStream();

        FileInputStream fileInputStream = new FileInputStream("IMG_3749.PNG");

        byte[] buffer = new byte[1024];
        int len;
        while ((len = fileInputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }

        fileInputStream.close();
        outputStream.close();
        socket.close();

    }

    @Test
    public void server() throws IOException {
        while (true) {
            ServerSocket serverSocket = new ServerSocket(9090);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();

            FileOutputStream fileOutputStream = new FileOutputStream("beautiful.PNG");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
            System.out.println("收到了来自于：" + socket.getInetAddress().getHostAddress() + "的数据");

            fileOutputStream.close();
            inputStream.close();
            socket.close();
            serverSocket.close();

        }
    }
}