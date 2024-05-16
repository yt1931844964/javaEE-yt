package java基础.ThisStatic;

public class Student {
    int id;
    double result;
    String name;
    public String school;
    String subject;
    public Student(){
        //这是一个空构造器
    }
    public Student(int id,double result,String name,String subject,String school){
        this(school);  //this调用结构体必须放在结构体第一句,用法为this（）
        this.id=id;  //this用来指代上面属性，否则采用就近原则  用法为this.
        this.result=result;
        this.name=name;
        this.subject=subject;

    }
    public Student(String school){
        this.school=school;

    }
    public void study(){

        System.out.println("努力学习");
    }
    public void rest(){
        System.out.println("休息一会");

    }



}
