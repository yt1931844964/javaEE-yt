package java进阶.IO流文件操作.IO流.字符流;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import  java.lang.*;
public class Reader {
    public static void main(String[] args) throws IOException {
        //创建file类对象
        File f= new  File("D:\\test.txt");
        //创建一FileReader的对象
        FileReader fr = new FileReader(f);
        //使用对象来读取文件
        //方法一：单字符读取
        int n =fr.read();
        while(n!=-1){    //当读取字符为-1时，表示文件结束
            System.out.println(n);
            n=fr.read();
        }

        //方法二：缓冲数组读取
        char[] ch = new char[5];
        int len = fr.read(ch);//读取有效长度
        while(len!=-1){
            for(int i=0;i<len;i++){
                System.out.println(ch[i]);
            }
            len = fr.read(ch);
        }
        //方法三：限制读取长度
        char[] ch2 = new char[5];
        int len2 = fr.read();
        while(len2!=-1){       //读取是一个一个字符读的
            String str = new String(ch2,0,5);
            System.out.println(str);
            len2 = fr.read();
        }

        //关闭流
        fr.close();
    }
}
