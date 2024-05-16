package java进阶.IO流文件操作.IO流.字符流;

import java.io.*;

public class 文件复制 {
    public static void main(String[] args) throws IOException {
        //创建file
        File f1 = new File("D:\\test.txt");
        File f2 = new File("D:\\copy.txt");
        //创建fileWriter和fileReader对象
        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2);
        //文件写入
        //方法一
        int n = fr.read();
        while (n!= -1) {
            fw.write(n);
            n= fr.read();
        }
        //方法二
        char[] ch = new char[3];
        int len = fr.read(ch);
        while(len!=-1){
            fw.write(ch,0,len);
            len = fr.read(ch);
        }
        //方法三
        char[] ch2 = new char[3];
        int len2 = fr.read(ch2);   //读取
        while(len2!=-1){
            String str = new String(ch,0,len2);
            fw.write(str);
            len2 = fr.read(ch2);
        }
        //关闭文件：先开后关
        fw.close();
        fr.close();

    }
}
