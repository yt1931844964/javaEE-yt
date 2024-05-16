package java基础.ThisStatic;

public class text {
    //static 修饰的属性是公共的，所以他只能有一个公共值
    public static void main(String[] args){
        Student st1=new Student(001,89.1,"姚婷","math","华北科技学院");
        Student st2=new Student();
        st2.school="清华大学";
        Student st3=new Student();
        st3.school="北京大学";
        st1.study();
        st1.rest();
        System.out.println(st1.id);
        System.out.println(st1.result);
        System.out.println(st1.name);
        System.out.println(st1.subject);
        System.out.println(st1.school);
        System.out.println(st2.school);
        System.out.println(st3.school);

    }
}
