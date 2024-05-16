package java进阶.网络编程.封装IP端口号;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class inetSocketAddress {
    public static void main(String[] args) {
        InetSocketAddress isa = new InetSocketAddress("localhost",8088);
        System.out.println(isa);
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());

        InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostName());
        System.out.println(ia.getHostAddress());
    }
}
/*
这段代码的作用是创建一个本地主机地址对象 InetSocketAddress，并用字符串 "localhost" 和端口号 8088 进行初始化，然后打印该地址信息和地址的主机名与端口号。

接着，通过调用 InetSocketAddress 类的 getAddress() 方法获得一个 InetAddress 对象 ia，并打印其主机名和IP 地址。
InetAddress 类代表互联网协议 (IP) 地址，getAddress() 方法可以返回该 SocketAddress 对象对应的 IP 地址。
 */