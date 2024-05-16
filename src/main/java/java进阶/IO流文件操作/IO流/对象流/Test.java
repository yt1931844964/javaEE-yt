package java进阶.IO流文件操作.IO流.对象流;
import java.io.*;

public class Test {

    public static void main(String[] args) {

        // 创建一个 Student 对象
        Student student = new Student("张三", 18, "男");

        // 写入对象到文件中
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("student.txt"))) {

            output.writeObject(student); // 将 Student 对象写入文件

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 从文件中读取对象并打印
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("student.txt"))) {

            Student readStudent = (Student) input.readObject(); // 从文件中读取 Student 对象

            System.out.println(readStudent); // 打印 Student 对象

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Student implements Serializable {  //必须要实现这个接口才能序列化
    private String name;
    private int age;
    private transient String gender; // 使用 transient  static关键字指定改字段不需要序列化

    public Student() {}

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "学生信息：[姓名=" + name + ", 年龄=" + age + ", 性别=" + gender + "]";
    }
}
