package java进阶.网络编程.套接字.基于UDP网络编程.简易聊天系统;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class TestSend {
    public static void main(String[] args) throws IOException {
        System.out.println("你的女朋友上线了");
        //套接字
        DatagramSocket ds = new DatagramSocket(8888);

       while(true){
           //准备数据包
           Scanner sc = new Scanner(System.in);
           String str = sc.next();

           byte[] bytes = str.getBytes();

           //需要四个参数1，传送数据转为字节数组 2，字节数组的长度 3，封装接受方的IP 4，指定接受方端口
           DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),9999);

           //发送
           ds.send(dp);
           if(str.equals("拜拜")){
               break;
           }
           //接受回复
           //创建空的数据包，用来接受对方数据包
           byte[] b = new byte[1024];
           DatagramPacket dp2  = new DatagramPacket(b,b.length);
           //接受数据包，放入我们的空包中
           ds.receive(dp2);
           //取出数据
           byte[] data = dp2.getData();
           String s = new String(data,0, dp2.getLength());
           System.out.println("你男朋友对你说: "+s);
       }



    }
}
