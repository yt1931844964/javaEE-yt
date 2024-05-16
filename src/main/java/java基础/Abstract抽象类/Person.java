package java基础.Abstract抽象类;
  /*
  面试：
  （1）抽象类中一定有构造器，  构造器作用：给子类初始化对象的时候要先用super调用父类构造器
  （2）抽象类不能被final修饰，因为抽象本身就是给子类继承使用，被final修饰就不存在继承了
   */

public abstract class Person {  //一直需要被子类重写的方法

    public Person(){

    }
    public void a(){

    }
    public abstract void b(); //一个方法的方法体去掉，然后被abstract修饰，这个方法就是抽象方法


}
    /*抽象类可以被继承
    一个类继承一个抽象类，这个类可以变成抽象类

     */
class Student extends Person{  //一般子类不需要被abstract修饰成抽象类，会让子类重写抽象方法
    public void b(){
        //抽象方法一定要在子类被重写，不然报错
        //子类继承抽象类，就必须重写全部的抽象方法
    }


    }

abstract  class Teacher extends  Person{
    //子类如果没有重写抽象方法，子类也可以变成抽象类


    }
    class Test{
        public static void main(String[] args) {
            //抽象类不可以创建对象  Person p =new Person();
            //可以创建子类对象
            Student b =new Student();
            //可以使用多态
            Person p = new Student() ;



        }
    }