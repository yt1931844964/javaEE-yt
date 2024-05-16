package java进阶.IO流文件操作.IO流.输入输出流;

import java.io.*;

public class 键盘录入到文件 {
    public static void main(String[] args) throws IOException {
        //键盘录入字节流，转换为字符流，输出字符流到文件（通过缓冲池）
        //键盘录入
        InputStream in =System.in;
        //字节流转换为字符流
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        //输出字符流到文件（缓冲池）
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("d://a.txt")));
        //开始动作
        String s =br.readLine();
        while(!s.equals("exit")){
            bw.write(s);
            bw.newLine();//文件中换行
            s =br.readLine();//读取下一行
        }
        //关闭流
        bw.close();
        br.close();
    }
}
