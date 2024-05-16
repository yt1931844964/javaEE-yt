package java基础.polymorphism多态;

public class test {
    public static void main(String[] args) {
        //泛化：先有子类，再抽取父类
        //继承：先有父类，再抽取子类
        //多态要素： 继承，重写，父类引用指向子类对象

        /*
        多态就是：同一个行为，不同的子类表现出来不同的形态
        多态指的是就是同一个方法调用，然后对象不同会产生不同的行为
        */
        /*
        多态好处：提高代码扩展性
         */
        YT yt =new YT();   //创建YT对象

        gjj p = new gjj();  //创建一个你喜欢的女生，然后引用主类
        Girl a = p;      //二合一（Girl a= new gjj();）
        yt.play(a);

        Girl g = new Girl();
        Girl an = Student.getGirl("郭晶晶");
        System.out.println(an.toString());


    }
}
