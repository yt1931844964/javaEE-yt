package java进阶.IO流文件操作.File.目录;

import java.io.File;

public class Test {
    //操作目录
    public static void main(String[] args) {
        File f = new File("D:\\ndm下载");

        //常用方法
        System.out.println("判断文件是否可读"+f.canRead());
        System.out.println("判断文件是否可写"+f.canWrite());
        System.out.println("文件的名字"+f.getName());
        System.out.println("上级目录"+f.getParent());
        System.out.println("文件大小"+f.length());
        System.out.println("是否为目录"+f.isDirectory());
        System.out.println("是否为文件"+f.isFile());
        System.out.println("是否隐藏"+f.isHidden());
        System.out.println("是否存在"+f.exists());
        //绝对路径和相对路径
        System.out.println("文件绝对路径"+f.getAbsolutePath());
        System.out.println("文件相对路径"+f.getPath());
        System.out.println(f.toString());
        //独有方法
        File f2 = new File("D:\\test\\test2\\test3");
        //创建目录
        //f2.mkdir();//创建单层目录：test
        f2.mkdirs();//创建多层目录：test2/test3
        //删除目录
        f2.delete();//只会删除一层目录：且必须是空目录

        //遍历目录下的文件和子目录

        String[] list1 = f2.list();
        for(String a: list1 ){
            System.out.println(a);
        }
        System.out.println("-------------");
        File[] files =f.listFiles();
        for(File file:files){
                System.out.println(file.getName()+","+file.getAbsolutePath());
            }

    }
}
