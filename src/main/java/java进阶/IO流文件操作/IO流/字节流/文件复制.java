package java进阶.IO流文件操作.IO流.字节流;

import java.io.*;

public class 文件复制 {
    public static void main(String[] args) throws IOException {
        //创建file
        File f1 = new File("D:\\Sunrise.jpg");
        File f2 = new File("D:\\copy.jpg");
        //创建fileWriter和fileReader对象
        FileInputStream fr = new FileInputStream(f1);
        FileOutputStream fw = new FileOutputStream(f2);
        //文件写入
        //方法一
        int n = fr.read();
        while (n!= -1) {
            fw.write(n);
            n= fr.read();
        }
        //方法二:利用缓冲数组
        byte[] ch = new byte[1024*3];
        int len = fr.read(ch);
        while(len!=-1){
            fw.write(ch,0,len);
            len = fr.read(ch);
        }

        //关闭文件：先开后关
        fw.close();
        fr.close();
    }
}
