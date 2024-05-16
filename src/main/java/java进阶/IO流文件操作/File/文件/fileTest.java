package java进阶.IO流文件操作.File.文件;

import java.io.File;
import java.io.IOException;

public class fileTest   {
    public static void main(String[] args) throws IOException {
        //将文件封装为一个file类的对象
        File f = new File("C:\\Users\\yt193\\Desktop\\java\\Java项目\\java进阶\\untitled\\src\\java进阶.IO流文件操作\\java进阶.测试.txt");
        File f1 = new File("src/java进阶.IO流文件操作/java进阶.测试.txt");
        //一般来说，为了防止各个操作系统文件路径拼接符号不一致，所以引入File.separator属性获取拼接符号
        File f2 = new File("src"+File.separator+"IO流文件操作"+File.separator+"java进阶.测试.txt");

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
        //比较两个文件地址是否相同
        System.out.println(f==f1);
        //比较文件路径是否相同
        System.out.println(f.equals(f1));
        //删除和创建
        if(f.exists()){ //如果存在就删除
            f.delete();
        }else{
            f.createNewFile();
        }
        //绝对路径和相对路径
        System.out.println("文件绝对路径"+f.getAbsolutePath());
        System.out.println("文件相对路径"+f.getPath());
        System.out.println(f.toString());

    }
}
