package java进阶.反射.引入;

import java.util.Scanner;

public class 常用 {
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
    public static void pay(WeChat wc){
        wc.Pay();
    }
    public static void pay(Zfb zfb){
        zfb.Pay();
    }

}
