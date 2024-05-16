package java进阶.IO流文件操作.IO流.转换流;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        //读取文件出来的字节流转换为字符流(InputStreamReader)到程序中，然后将字符流转换为字节流输出到文件中(OutputStreamWriter)
        //读取源文件
        File f1 = new File("d://test.txt");
        //目标文件
        File f2 = new File("d://output.txt");
        //字节转字符
        FileInputStream fis = new FileInputStream(f1);
        InputStreamReader isr = new InputStreamReader(fis,"utf-8"); //源文件字符编码格式不一致会导致乱码
        //字符转字节
        FileOutputStream fos = new FileOutputStream(f2);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
        //开始复制
        char[] ch = new char[1024];
        int len = isr.read(ch);
        while(len!=-1){
            osw.write(ch,0,len);
            len=isr.read(ch);
        }
        //关闭
        osw.close();
        isr.close();
    }
}
