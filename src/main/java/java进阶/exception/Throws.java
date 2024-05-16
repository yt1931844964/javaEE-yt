package java进阶.exception;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) throws Exception {       //throws抛出异常给jdk
        div();

    }
    public static void div () throws Exception{   //throws抛出异常给main函数
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        if(b==0){


            //制造检查时异常：
            /* try{
                throw new Exception();
            }catch(Exception ex){
                ex.printStackTrace();
            }*/

            //throws抛出异常
            throw new Exception();
        }
        System.out.println(a/b);
    }
}
