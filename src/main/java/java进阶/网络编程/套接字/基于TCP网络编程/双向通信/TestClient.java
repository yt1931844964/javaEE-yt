package java进阶.网络编程.套接字.基于TCP网络编程.双向通信;

import java.io.*;
import java.net.Socket;

public class TestClient {//客户端
    public static void main(String[] args) throws IOException {
        //创建套接字，指定服务器IP和端口号
        Socket s = new Socket("10.12.115.235",8080);
        //利用输出流发送数据
        OutputStream os= s.getOutputStream();//可以发送数据但是没有发送String的方法
        DataOutputStream dos = new DataOutputStream(os); //套的处理流，方便发送String
        dos.writeUTF("你好呀，这是我的单向通信");
        //接受反向数据
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("客户端说："+str);
        //关闭流和网络资源
        dis.close();
        is.close();
        dos.close();
        os.close();
        s.close();

/*
这段代码用于获取一个输出流对象，该输出流对象与网络套接字 s 相关联。在网络编程中，可以通过该输出流向目标主机发送数据。
具体来说，这里使用了两个类：OutputStream 和 DataOutputStream。

首先，使用 s 对象的 getOutputStream() 方法创建一个 OutputStream 类型的实例 os，该实例可以向 Socket 对象 s 关联的远程主机写入数据。
然后，创建一个 DataOutputStream 类型的实例 dos，并将 os 对象作为参数传递给它的构造方法，这样就创建了一个数据输出流对象。

数据输出流 DataOutputStream 继承自 FilterOutputStream，提供了一些方便的方法，例如 writeInt()、writeLong() 等，
可以方便地将 Java 基本数据类型转换为字节流进行输出。因此，我们可以通过数据输出流向远程主机发送数据。
 */
    }
}
