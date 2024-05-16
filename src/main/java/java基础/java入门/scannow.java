package java基础.java入门;

import java.util.Scanner;   //java.util.*;

public class scannow {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);  //映入扫描器
        int age=sc.nextInt();
        String name=sc.next();
        double height=sc.nextDouble();
        boolean id=sc.nextBoolean();
        System.out.println(age);
        System.out.println(name);
        System.out.println(height);
        System.out.println("名字是："+id);



    }


}
