package java进阶.IO流文件操作.IO流.字节流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {
    public static void main(String[] args) throws IOException {
        //创建file对象
        File f = new File("D:\\Sunrise.jpg");
        //创建FileOutputStream对象
        FileOutputStream fw = new FileOutputStream(f);
        //写入字符串"Hello World!"到文件
        //方法一
        String str ="Hello World!";
        for(int i=0;i<str.length();i++){
            fw.write(str.charAt(i));
        }

        //关闭文件
        fw.close();
    }
}
