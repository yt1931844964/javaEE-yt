package java进阶.exception;
//异常
public class Try {
    //格式
    //把可能出现异常的代码放入try catch中，将异常封装为对象，执行catch{}中的代码
    public static void main(String[] args) {
        try{
            System.out.println(34/0); //如果被捕获，try里面代码不执行
        }catch (Exception ex){
            System.out.println("出现异常");
        }
        //不影响后面代码，照样执行
        System.out.println("gdg"); //出现异常 gdg

    }
}
