package java基础.java入门;

import java.util.Scanner;

public class Suanshu {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int num1=num%10;
        int num2=num/10%10;
        int num3=num/100%10;
        int num4=num/1000;
        int a=34; int b=45;
        int m=a++;
        int n=b--;
        System.out.println("个位是:"+num1+  "十位是:"+num2+  "百位是:"+num3+  "千位是:"+num4);
        System.out.println(m+n);


    }
}
