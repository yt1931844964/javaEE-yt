package java进阶.反射.引入;

import java.util.Scanner;

public class 多态 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        if("微信".equals(str)){
            pay(new WeChat());

        }
        if("支付宝".equals(str)){
            pay(new Zfb());

        }
    }
    public static void pay(Mtwm mtwm){  //使用多态可以简洁代码
        mtwm.Pay();
    }

}
