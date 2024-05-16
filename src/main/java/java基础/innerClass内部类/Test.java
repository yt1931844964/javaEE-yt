package java基础.innerClass内部类;
      /*
      1.类的组成：属性，方法，构造器，代码块（普通块，静态块，构造快，同步块（线程）），内部类
      2，一个类的内部的类叫做内部类
      3.内部类 成员内部类（静态的，非静态的） 和 局部内部类（位置：方法内，快内，构造期内）
      4，成员内部类：
            里面属性，方法，构造器等
            修饰符：private,default,protected,public,final,abstract
       */

public class Test {
    //属性：
    int age;
    static int id;
    //方法
    public void method(){
        System.out.println(this.age);
    }

    public static void demo(){
        System.out.println(id);
    }

    //构造器
    public Test(){
        {
            //这是构造块
        }

    }
    {
        //这是一个普通代码块
        int age=20;
        if (age>10){
            this.age=age;
        }
    }
    static{
        //这是一个静态代码块
        int age=20;
        if (age>10){
            System.out.println("用不了this.age");
        }

    }
    //成员内部类
    public class a{
        int age=20;
        String name;
        public void method(){
            //内部类可以访问外部类的内容
            System.out.println(age);
            method();

            int age=30;
            System.out.println(age);//30
            System.out.println(this.age);//20   //成员内部类的属性
            System.out.println(Test.this.age);//0  //这是外部类的属性


        }


    }
    //静态成员内部类
    static class b{
        public void method(){
            System.out.println(id);//静态方法只能访问外部类中被static修饰的内容
            demo();
        }

    }

    //创建一个方法内部类（用于只使用一次的类）
    public Comparable method2(){
        class c implements Comparable{ //接口

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new c();

    }
    //创建匿名内部类
    public Comparable method3(){
        return new Comparable() {    //返回一个Comparable类型的对象类，这就是匿名类
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
    public void teat(){
        Comparable com =new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };
        System.out.println(com.compareTo("abc"));
    }

    class Demo{
        public static void main(String[] args) {
            //创建外部类的对象
            Test ro=new Test();
            ro.method();
            //创建内部类的对象
            //静态的成员内部类创建对象
            Test.b to = new Test.b();
            //非静态的成员内部类创建对象
            Test he =new Test();
            Test.a hh = he.new a();  //不能像创建静态一样，静态能够 类名.方法名创建对象，但是非静态可以用多态



        }
    }




}
