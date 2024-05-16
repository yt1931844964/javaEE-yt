package java基础.Class;

public class text {
    public  static void main(String[] args) {
        Person a=new Person();
        a.age=18;
        a.name="姚婷";
        a.height=180.0;
        System.out.println(a.age);
        System.out.println(a.name);
        System.out.println(a.height);
        Person b=new Person(20,"gjj",168);
        a.work();
    }
}
