package src.网络Socket_TCP_UDP;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Time : 2022/6/13 20:41
 * @Author : wu
 * @File : w03_TCPTest3.java
 * @Software: IntelliJ IDEA
 */
public class w03_TCPTest3 {

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

        socket.shutdownOutput();

        //接收来自于服务器端的数据，并显示到控制台上
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer1 = new byte[1024];
        int len1;
        while ((len1= inputStream.read(buffer1))!= -1){
            byteArrayOutputStream.write(buffer1,0,len1);
        }

        System.out.println(byteArrayOutputStream);

        //
        fileInputStream.close();
        outputStream.close();
        socket.close();
        byteArrayOutputStream.close();


    }

    @Test
    public void server() throws IOException {
        while (true) {
            ServerSocket serverSocket = new ServerSocket(9090);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();

            FileOutputStream fileOutputStream = new FileOutputStream("beautifu2.PNG");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }

            System.out.println("图片传输完成");

            //服务器端给予客户端反馈
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("你好，非常好，我非常满意！".getBytes());

            System.out.println("收到了来自于：" + socket.getInetAddress().getHostAddress() + "的数据");

            fileOutputStream.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
            outputStream.close();

        }


    }
}
