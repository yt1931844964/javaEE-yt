package java进阶.网络编程.封装IP端口号;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetAddress {
    public static void main(String[] args) throws UnknownHostException {
        //封装IP
        //InetAddress ia1= new inetAddress(); //不能直接创建对象，因为被default修饰了
        InetAddress ia2 = InetAddress.getByName("10.12.115.235");
        System.out.println(ia2);
        InetAddress ia3 = InetAddress.getByName("localhost");//localhost代指本机地址
        System.out.println(ia3);
        InetAddress ia4 = InetAddress.getByName("127.0.0.1");//127.0.0.1也代指本机地址
        System.out.println(ia4);
        InetAddress ia5 = InetAddress.getByName("姚廷gjj");//封装计算机名
        System.out.println(ia5);
        InetAddress ia6 = InetAddress.getByName("www.pornhub.com");//封装域名
        System.out.println(ia6);

        System.out.println(ia6.getHostAddress());//获取IP地址
        System.out.println(ia6.getHostName());//获取域名
    }
}
