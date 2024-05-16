package java进阶.反射.可以作为Class类的实例的种类;

public class Test {
    public static void main(String[] args) {
        /*
        Class类的实例种类
        （1）类
        （2）接口
        （3）java进阶.注解
        （4）数组
        （5）基本数据类型
        （6）void方法（无返回值）
         */
        Class c1 = Person.class;
        Class c2 = Comparable.class;
        Class c3 = Override.class;
        System.out.println(c1);

        int[] a= {1,2,3};
        Class c4 =a.getClass();
        int[] arr= {1,2,3};
        Class c5 =arr.getClass();
        System.out.println(c4 ==c5);
        Class c6 = Integer.class;
        Class c7 = Void.class;

    }
}
