package java进阶.exception;

public class Test2 {
    public static void main(String[] args) throws Exception{
       int i = 1;
       try{
            i =4;
       }finally{
           i--;
           System.out.println(i);
       }


    }
}
