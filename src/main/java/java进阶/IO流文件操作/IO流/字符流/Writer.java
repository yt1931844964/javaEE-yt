package java进阶.IO流文件操作.IO流.字符流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
        //创建file对象
        File f = new File("D:\\test.txt");
        //创建fileWrite对象
         /*
        如果目标不存在：自动创建目标文件
        目标存在：
        new FileWriter(f); 对源文件覆盖操作
        new FileWriter(f,false);对源文件覆盖操作
        new FileWriter(f,true);对源文件追加操作
          */
        FileWriter fw = new FileWriter(f);
        //写入字符串"Hello World!"到文件
        //方法一
        String str ="Hello World!";
        for(int i=0;i<str.length();i++){
            fw.write(str.charAt(i));
        }
        //方法二
        char[] ch = str.toCharArray();
        fw.write(ch);

        //关闭文件
        fw.close();
    }
}
