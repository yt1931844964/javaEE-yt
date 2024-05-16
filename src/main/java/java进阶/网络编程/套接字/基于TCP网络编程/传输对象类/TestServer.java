package java进阶.网络编程.套接字.基于TCP网络编程.传输对象类;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {     //先开启服务器等待，再通过客户端发送。
    public static void main(String[] args) throws IOException, ClassNotFoundException {   //服务器
        //创建套接字，指定服务器端口号
        ServerSocket ss =new ServerSocket(8080);

        //等待客户端发来的信息
        Socket s = ss.accept();//这段代码用于在服务器端创建一个 ServerSocket 对象 ss，然后调用其 accept() 方法，等待客户端的连接请求。
        // accept() 方法会阻塞程序执行，直到有客户端连接上该服务器，才会返回一个 Socket 对象 s。
        // 一旦有客户端连接上服务器，服务器就可以通过 s 对象与该客户端建立网络通信，例如发送或接收数据等操作。
        // 注意，accept() 方法每次只会返回一个 Socket 对象，如果需要同时处理多个客户端连接，就需要使用多线程技术处理每个客户端的请求。

        //操作流
        InputStream is =s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        User user = (User)(ois.readObject());
        //输入流读取数据
        boolean flag = false;
        if(user.getId().equals("yt")&&user.getPwd().equals("131425")){
            flag = true;
        }
        //输出结果
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeBoolean(flag);

        //关闭流和网络资源
        dos.close();
        ois.close();
        is.close();
        s.close();
        ss.close();

    }
}
