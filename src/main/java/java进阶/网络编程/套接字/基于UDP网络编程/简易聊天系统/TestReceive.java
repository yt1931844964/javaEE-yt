package java进阶.网络编程.套接字.基于UDP网络编程.简易聊天系统;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class TestReceive {
    public static void main(String[] args) throws IOException {
        System.out.println("宿命上线了" );
        //套接字
        DatagramSocket ds = new DatagramSocket(9999);
        while(true){
            //创建空的数据包，用来接受对方数据包
            byte[] b = new byte[1024];
            DatagramPacket dp  = new DatagramPacket(b,b.length);
            //接受数据包，放入我们的空包中
            ds.receive(dp);
            //取出数据
            byte[] data = dp.getData();
            String s = new String(data,0, dp.getLength());
            System.out.println("你女朋友对你说: "+s);
            if(s.equals("拜拜")){
                break;
            }
            //回复
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            byte[] bytes = str.getBytes();
            //需要四个参数1，传送数据转为字节数组 2，字节数组的长度 3，封装接受方的IP 4，指定接受方端口
            DatagramPacket dp2 = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),8888);
            ds.send(dp2);
        }



    }
}
