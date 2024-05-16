package java基础.Class;

public class Person {
    int age;
    String name;
    double height;
    public Person() { //这是一个空构造器

    }
    public  Person(int age,String name,double height){
        this.age=age;
        this.name=name;
        this.height=height;
    }
    public void eat(){
        System.out.println("人类开始吃饭");

    }
    public void work(){

        System.out.println("人类开始工作");
    }


}
