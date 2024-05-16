package java进阶.IO流文件操作.IO流.缓冲流.缓冲字符流;

import java.io.*;

public class Buffered {
    public static void main(String[] args) throws IOException {
        //创建file
        File f1 = new File("D:\\test.txt");
        File f2 = new File("D:\\copy.txt");
        //创建fileWriter和fileReader对象
        FileReader fr = new  FileReader(f1);
        FileWriter fw = new FileWriter(f2);
        //创建缓冲区对象，用于处理输入和输出（加强功能）
        BufferedReader bis = new BufferedReader(fr);
        BufferedWriter bos = new BufferedWriter(fw);
        //开始复制文件或者其他操作
        char [] b = new char[1024*10]; //方法一缓冲流
        int len = bis.read(b);
        while(len!=-1){
            bos.write(b,0,len);
            bos.flush();//刷新缓冲区
            len = bis.read(b);


        }
        int n= bis.read(); //方法二，常规
        while(n!=-1){
            bos.write(n);
            n=bis.read();
        }
        //方法三
        String str = bis.readLine();
        while(str!=null){
            bos.write(str);
            bos.newLine(); //新起m一行
            str = bis.readLine();
        }



        //关闭文件：倒着关
        bos.close();
        bis.close();
        fw.close();
        fr.close();


    }
}
/*
缓冲流的原理是在输入输出流的基础上增加了一个缓冲区，数据首先被读入缓冲区，当缓冲区满时再一次性输出到目标设备或文件，
这样可以提高读写数据的效率。

对于输入流，当我们使用缓冲流读取数据时，程序并不是每次都直接从磁盘中读取数据，而是先将数据读入到内存中的缓冲区，
等到缓冲区被填满后才一次性向程序返回所需的数据。这样做的好处是可以减少磁盘访问次数，提高读取数据的效率。

对于输出流，当我们使用缓冲流写入数据时，程序并不是每次都直接向磁盘中写入数据，而是先将数据写入到内存中的缓冲区，
等到缓冲区被填满后再一次性将所有数据写入磁盘。这样做的好处是可以减少磁盘访问的次数，提高写入数据的效率。

总之，缓冲流的原理就是：通过增加一个缓冲区来减少对设备访问的次数，提高数据读写的效率。
 */