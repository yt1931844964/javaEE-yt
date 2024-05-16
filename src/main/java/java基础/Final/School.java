package java基础.Final;

public class School {
    public static void main(String[] args) {
        //final 修饰属性，则属性不能被改变
        final int id = 10; //必须初始化一个值
        // final 修饰引用数据类型，地址值不可以改变,但是对象的属性依然可以改变
        final fuck an = new fuck();
        an.a=100;
        an.b=12;
        //第三
        final fuck an2 = new fuck();
        a(an2);
        b(an2);


    }
    public  static void a(fuck d){
        d=new fuck();
    }
    public  static  void b(final fuck  d){
       // d=new fuck(); //无法将值赋给 final 变量 'd'
    }


}
