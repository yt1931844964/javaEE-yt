package java基础.Super;

public class Person {
    int a=20;
    int c;
    int d;

    public Person(){
     super();  //构造器的父类是object
    }
    public Person(int a){
        this.a=a;
    }

    public Person(int c, int d) {
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void eat(){
        System.out.println("荒古圣体");
    }


}
