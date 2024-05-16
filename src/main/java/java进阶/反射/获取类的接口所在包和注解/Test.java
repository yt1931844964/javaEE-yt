package java进阶.反射.获取类的接口所在包和注解;

import java.lang.annotation.Annotation;

public class Test {
    public static void main(String[] args) {
        //获取运行时字节码信息
        Class clazz = Student.class;
        //获取运行时此类的接口
        Class[] interfaces = clazz.getInterfaces(); // 获取此类实现的所有接口
        for(Class c:interfaces){
            System.out.println(c);
        }
        //得到父类的接口
        Class[] interfaces2 = clazz.getSuperclass().getInterfaces(); // 获取父类所实现的所有接口
        for(Class c:interfaces2){
            System.out.println(c);
        }
        //获取运行时类所在的包
        Package pkg = clazz.getPackage(); // 获取此类所在的包
        System.out.println(pkg);

        //获取运行时类的注解
        Annotation[] annotations = clazz.getAnnotations(); // 获取此类上的所有注解
        for(Annotation c:annotations){
            System.out.println(c);
        }


    }
}
