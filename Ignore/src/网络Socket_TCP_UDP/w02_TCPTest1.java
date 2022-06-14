package src.网络Socket_TCP_UDP;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


/*
客户端发送信息到服务端，服务端将数据显示到控制台上
 */
public class w02_TCPTest1 {

    //客户端
    @Test
    public void client(){

        Socket socket = null;
        OutputStream outputStream = null;
        try {
            //创建socke对象，指明服务器端的ip和端口号
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress, 8899);
            //获取一个输出流，用于输出数据
            outputStream = socket.getOutputStream();
            //写出数据的操作
            outputStream.write("你好，我是客户端mm".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream!= null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!= null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //服务端
    @Test
    public void server() {
        while (true){
            ServerSocket serverSocket = null;
            Socket socket = null;
            InputStream inputStream = null;
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                //创建服务器端的ServerSocket，指明自己的端口号
                serverSocket = new ServerSocket(8899);
                //接收来自客户端 的socket
                socket = serverSocket.accept();
                //获取输入流
                inputStream = socket.getInputStream();

                //不建议，可能出现乱码
//        byte[] buffer = new byte[1024];
//        int len;
//        while ((len = inputStream.read(buffer))!= -1){
//            String s = new String(buffer, 0, len);
//            System.out.println(s);
//        }
                //读取输入流中的数据
                byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[5];
                int len;
                while ((len = inputStream.read(buffer)) != -1){
                    byteArrayOutputStream.write(buffer,0,len);
                }

                System.out.println(byteArrayOutputStream.toString());
                System.out.println("收到了来自于：" + socket.getInetAddress().getHostAddress() + "的数据");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //关闭资源
                if (byteArrayOutputStream!= null){
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (inputStream != null){
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (socket!= null){
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (serverSocket!=null){
                    try {
                        serverSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


    }
}
