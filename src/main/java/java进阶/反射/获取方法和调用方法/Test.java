package java进阶.反射.获取方法和调用方法;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //获取运行时字节码信息
        Class cls = Student.class;
        //一、获取方法
        //（1）public修饰的   会获得所有父类方法的public修饰的方法
        Method[] methods = cls.getMethods();
        for(Method m:methods){
            System.out.println(m);
        }
        System.out.println("------------------");
        //（2）其他修饰符修饰的
        Method[] methods2 = cls.getDeclaredMethods();
        for(Method m:methods2){
            System.out.println(m);
        }
        System.out.println("------------------");
        //二、获取指定方法
        Method method = cls.getMethod("sleep");
        System.out.println(method);
        Method declaredMethod = cls.getDeclaredMethod("Wc");
        System.out.println(declaredMethod);
        Method declaredMethod2 = cls.getDeclaredMethod("eat",int.class);//有参数的
        System.out.println(declaredMethod2);
        System.out.println("------------------------");

        //三、获取方法具体结构（名字，修饰符，返回值，参数列表，java进阶.注解，异常）
        System.out.println(method.getName());//名字
        //修饰符
        int modifiers = method.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        //返回值
        System.out.println(method.getReturnType());
        //参数列表
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (Class c :parameterTypes){
            System.out.println(c);
        }
        System.out.println("-----------------------------");
        //获取注解
        Annotation[] annotations = method.getAnnotations();
        for(Annotation a:annotations){
            System.out.println(a);
        }
        //获取异常
        Class<?>[] exceptionTypes = method.getExceptionTypes();
        for (Class c:exceptionTypes){
            System.out.println(c);
        }
        System.out.println("---------------");


        //三、调用方法

        Object o = cls.newInstance();
        method.invoke(o);


    }
}
