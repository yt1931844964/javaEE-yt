package java进阶.exception;
import java.util.Scanner;
         /*
         throw和throws区别：
            （1）位置不同：
                throw：方法内部
                throws：方法的签名处（声明处）
            （2）内容不同：
                throw：throw+异常对象（检测异常，运行时异常）
                throws：throws+异常类型（可以多个类型，用 ， 拼接）
            （3）作用不同：
                throw：异常出现的源头，制造异常
                throws：在方法的声明处，告诉方法调用者，这个方法中可能出现我声明的这些异常，然后调用者他要么自己处理，要么抛出给别人
          */
public class Throw  {
    public static void main(String[] args)  {
        div();

    }
    public static void div () {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        if(b==0){
            //制造运行时异常
            throw new RuntimeException();   //如果是Exception就要try-catch
            //Exception in thread "main" java.lang.RuntimeException

            //制造检查时异常：
            /* try{
                throw new Exception();
            }catch(Exception ex){
                ex.printStackTrace();
            }*/


        }
        System.out.println(a/b);
    }
}
