package java进阶.IO流文件操作.IO流.输入输出流.输入流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class systemIn {
    public static void main(String[] args) throws IOException {
        //标准输入流
        InputStream in =System.in;  //键盘录入
        //调用方法
        int data = in.read();
        System.out.println(data);
        //之前的Scanner是一个扫描器，System.in才是负责录入的
        Scanner sc = new Scanner(System.in);
        int a=  sc.nextInt();
        System.out.println(a);
        //试一试Scanner的扫描作用（扫描其他录入的内容）
        Scanner in2=new Scanner(new FileInputStream(new File("d:\\test.txt")));
        while(in2.hasNext()){
            System.out.println(in2.next());
        }



    }
}
