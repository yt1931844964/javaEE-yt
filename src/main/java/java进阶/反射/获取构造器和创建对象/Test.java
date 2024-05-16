package java进阶.反射.获取构造器和创建对象;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取字节码信息
        Class cls = Student.class;
        //一、 通过字节码信息获取构造器

        //(1)获取当前运行时被public修饰的构造器
        Constructor[] c1 =cls.getConstructors();
        for(Constructor c:c1){
            System.out.println(c);
        }
        System.out.println("--------------------------------");
        //(2)获取当前运行时全部修饰符修饰的构造器
        Constructor[] c2 =cls.getDeclaredConstructors();
        for(Constructor c:c2){
            System.out.println(c);
        }
        System.out.println("--------------------------------");



        //二、获取指定的构造器

        //(1)得到空参构造器
        Constructor c3 =cls.getConstructor();
        System.out.println(c3);
        System.out.println("--------------------------------");
        //(2)得到有参构造器（public）
        Constructor c4 =cls.getConstructor(int.class,double.class,boolean.class,float.class);
        System.out.println(c4);
        System.out.println("--------------------------------");
        //(3)得到有参构造器（其他修饰符）
        Constructor c5 =cls.getDeclaredConstructor(int.class);
        System.out.println(c5);
        System.out.println("--------------------------------");
        //创建对象(通过构造器)
        Object o1 =c3.newInstance();
        System.out.println(o1);

        Object o2 = c4.newInstance(12,12.0,true,12);
        System.out.println(o2);



    }
}
