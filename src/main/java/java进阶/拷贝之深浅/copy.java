package java进阶.拷贝之深浅;

/**
 * @program: java基础
 * @description: 拷贝
 * @author: Mr.姚廷
 * @create: 2024-04-16 21:26
 **/
public class copy extends Object {
    public static void main(String[] args) {

        Student studentOne = new Student("yt", 18, "zhangsan");
        //浅拷贝:栈的地址引用旧对象
        // Student studentTwo = studentOne.clone();  //地址引用
        // System.out.println(studentOne.equals(studentTwo));
        //深拷贝：堆中开辟一个新的对象
        Student s1 = new Student("yt", 16, "zhangsan");
        Student s2 = new Student(s1);
        System.out.println(s1 == s2);

    }
}
