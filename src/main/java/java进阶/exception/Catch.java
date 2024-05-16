package java进阶.exception;

import java.util.Scanner;
//catch处理方式
public class Catch {
    public static void main(String[] args) {
     try{
         Scanner sc = new Scanner(System.in);
         int a=sc.nextInt();
         int b = sc.nextInt();
         System.out.println(a/b);
     }catch(Exception ex){
         //第一种处理：什么都不屑

         //第二种处理：用户自定义异常信息
         System.out.println("出现错误");

         //第三种处理：打印异常信息
         //显示异常类名（全限定路径）
         System.out.println(ex); //java.lang.ArithmeticException: / by zero
         System.out.println(ex.toString()); //java.lang.ArithmeticException: / by zero
         //显示异常信息对应的字符串,如果没有返回null
         System.out.println(ex.getMessage()); /// by zero
         //显示异常堆栈信息：将异常捕获之后在控制台显示
         ex.printStackTrace();//java.lang.ArithmeticException: / by zero
                              // at java进阶.exception.test1.main(test1.java:12)

         //第四种处理：抛出异常
         throw ex; /*Exception in thread "main" java.lang.ArithmeticException: / by zero
	               at java进阶.exception.test1.main(test1.java:12)
                   */

     }
        System.out.println("我应该不会被影响把");
    }
}
