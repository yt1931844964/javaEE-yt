package java基础.java入门;

import java.math.*;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        int a=(int)(Math.random()*6)+1;  //[1,6]
        System.out.println(a);
        Scanner sc=new Scanner(System.in);
        boolean p=sc.hasNextInt();   //判断录入数据是不是int类型（true or false）,或hasNextDouble/Float......
        System.out.println(p);
    }
}
