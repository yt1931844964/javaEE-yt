package java进阶.反射.获取字节码信息的四种形式;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //方式1，通过getClass()方法获取
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);
        //方式2,通过内置class属性
        Class c2 = Person.class;
        System.out.println(c2);


        //方式一二不常用 ，三四常用

        //方式3，调用class类提供的静态方法forName
        Class  c3 = Class.forName("java进阶.反射.获取字节码信息的四种形式.Person");
        System.out.println(c3);
        //方式4 利用类的加载器
        ClassLoader loader =Test.class.getClassLoader();
        Class c4 =loader.loadClass("java进阶.反射.获取字节码信息的四种形式.Person");
        System.out.println(c4);



        System.out.println(c1 == c2);

    }
}
