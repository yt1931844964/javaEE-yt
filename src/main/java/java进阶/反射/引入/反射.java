package java进阶.反射.引入;

import java.lang.reflect.Method;
import java.util.Scanner;

public class 反射 {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入路径如：java进阶.反射.引入.Zfb");
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        Class cls =Class.forName(str);
        Object o =cls.newInstance();
        Method method = cls.getMethod("Pay");
        method.invoke(o);
    }
}
