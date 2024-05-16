package java进阶.IO流文件操作.IO流.数据流;
import java.io.*;

public class test {

    public static void main(String[] args) {

        // 创建一个 Student 对象
        Student student = new Student("张三", 18, "男");

        // 写入对象到文件中
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("student.dat"))) {

            output.writeUTF(student.getName()); // 写入姓名
            output.writeInt(student.getAge()); // 写入年龄
            output.writeUTF(student.getGender()); // 写入性别

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 从文件中读取对象并打印
        try (DataInputStream input = new DataInputStream(new FileInputStream("student.dat"))) {

            Student readStudent = new Student(); // 创建一个新的 Student 对象

            readStudent.setName(input.readUTF()); // 读取姓名
            readStudent.setAge(input.readInt()); // 读取年龄
            readStudent.setGender(input.readUTF()); // 读取性别

            System.out.println(readStudent); // 打印 Student 对象

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    private String name;
    private int age;
    private String gender;

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
