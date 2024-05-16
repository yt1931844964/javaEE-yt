package java基础.Super;

public class Student extends Person{
    int a=100;
    public Student(){
        super();   //构造器的父类（可省略）
    }
    public   Student(int a){
        super.a=this.a;
        a=super.a;

    }
    //所有构造器中第一行默认情况中都有super（）；
    public Student(int a,int c,int d){
        super(c,d);   //调用父类构造器     必须放在第一行（this调用构造器也要放在第一行）
        //this（a） 就不能使用了
        this.a=a;



    }
//super指的是父类的  如果子类和父类出现相同的属性或者方法，如果想要访问父类的属性和方法，就要使用super.
    public void test(){
        System.out.println(a);   //会直接给访问子类
        System.out.println(super.a);    //会直接访问父类
        super.eat();
        /*
        100
        20
        荒古圣体
         */

    }


    public static void main(String[] args) {
        Student b= new Student();
        b.test();
        Student g= new Student(20);
        System.out.println(g.a);   //100

    }


}
