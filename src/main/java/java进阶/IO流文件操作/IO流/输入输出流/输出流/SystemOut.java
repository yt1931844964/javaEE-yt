package java进阶.IO流文件操作.IO流.输入输出流.输出流;

import java.io.PrintStream;

public class SystemOut {
    public static void main(String[] args) {
        PrintStream out=System.out;
        //方法
        out.println(System.getProperty("line.separator"));
        out.print("fdfb");
        out.println("上面这位没有换行");
    }
}
