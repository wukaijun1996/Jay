package src.网络Socket_TCP_UDP;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class w01_InetAddressTest {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress);

        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());

        System.out.println(InetAddress.getLocalHost());

        System.out.println(Inet4Address.getLocalHost());
        System.out.println(Inet6Address.getLocalHost());


    }

}