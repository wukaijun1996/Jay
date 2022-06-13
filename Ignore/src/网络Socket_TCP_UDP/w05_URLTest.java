package src.网络Socket_TCP_UDP;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Time : 2022/6/13 21:37
 * @Author : wu
 * @File : w05_URLTest.java
 * @Software: IntelliJ IDEA
 */
public class w05_URLTest {


    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("https://www.dabaicai.com/");

        System.out.println(url.getProtocol());//获取该url的协议名    https
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(url.getQuery());

    }

}
