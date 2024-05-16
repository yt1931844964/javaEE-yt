package java进阶.反射.获取属性和对属性进行赋值;

import java进阶.注解.元注解.MyAnnotation;
import java进阶.注解.元注解.MyAnnotation2;

public class Student extends Person implements MyInterface2 {
    //四种属性
    public int name;
    private double age;
    protected boolean sex;
    float weight;
    public int score;
    //四种构造器


    public Student(int name, double age, boolean sex, float weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }
    private Student(){

    }
    protected Student(int name, double age){
        this.name = name;
        this.age = age;
    }
    Student(float weight){
        this.weight =weight;
    }

    //四种方法
    @Override
    public void sleep() {
        System.out.println("sleep.....");
    }
    @MyAnnotation2()
    protected void work(int name){
        System.out.println("work.......");
    }

    int eat(int age){
        return age;
    }
    @MyAnnotation(value="abc")
    private void Wc(){
        System.out.println("wc......");
    }
}
