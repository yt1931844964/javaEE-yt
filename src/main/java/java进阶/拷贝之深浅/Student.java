package java进阶.拷贝之深浅;

/**
 * @program: java基础
 * @description: student类
 * @author: Mr.姚廷
 * @create: 2024-04-16 21:27
 **/
public class Student {

    private String name;
    private Integer age;
    private String address;

    public Student() {
    }

    public Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student(Student s) {
    }


    private String run(){
        return "ridssion";
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

}
