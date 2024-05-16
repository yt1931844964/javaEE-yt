package java基础.接口;      /*
      继承：子类对父类
      实现：实现类对接口的实现
      多态的应用场合：
      （1）父类当作方法的形参，传入具体的子类对象
      （2）父类当作方法的返回值，返回的是具体的子类的对象
      （3）接口当作方法的形参，传入具体的实现类的对象
      （4）接口当作方法的返回值，返回的是具体的实现类的对象
       */

public interface Test {    //这是一个接口
    //被interface修饰的就是接口
    //接口和类是同一层次
    //接口没有构造器
    //常量：public static final 常量
    //抽象方法：public abstract 方法名
    //非抽象方法：用public default 修饰
    //静态方法：public static 修饰

    public static final int a=100; //修饰可省略
    public abstract void play();   //修饰可省略

    public default void wan(){    //一定要加default
        System.out.println("这是一个非抽象方法");
    };

    public static void fun(){
        System.out.println("静态方法");
    }


}    //一旦实现一个接口，那么实现类要重写接口中全部的抽象方法，也可以变成抽象类



class dom implements Test {    //意思是和接口产生关系   “implements”
    public void play() {
        /*
        Java只能单继承（一个子类继承一个父类），但是可以多 实现（实现多个接口）
         */

        System.out.println("我是一个被重写的抽象类");


    }
}

class girl extends dom implements Test {
    //可以先继承再实现  class test extends b implements interface1,interface2.......{}

    public void wan(){     //default 一定不能加
        System.out.println("被重写的非抽象方法");
    }
    public static void fun(){
        System.out.println("被重写的静态方法");
    }

}


class text{
    public static void main(String[] args) {

        //接口不能创建对象
        //可以指向实现类------》多态
        Test a = new dom();
        System.out.println(a.a);  //指向实现类
        //接口常量如何访问
        System.out.println(Test.a);
        System.out.println(dom.a);

        dom b = new dom();
        System.out.println(b.a);

        girl p = new girl();
        p.wan();
        p.play();
        //静态方法可以用 类名.方法名 提取
        p.fun();
        Test.fun();
        girl.fun();
        /*
100
100
100
100
被重写的非抽象方法
我是一个被重写的抽象类
被重写的静态方法
静态方法
被重写的静态方法
         */

    }

    }




