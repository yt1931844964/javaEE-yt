package java基础.studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;
public class TestMain {

    public static void main(String[] args) {
        // ArrayList<参数化类型> list = new ArrayList<参数化类型>();
        // 使用泛型ArrayList<Student>之后，表示ArrayList集合中只允许存储Student类型的数据
        // 用泛型指定集合中存储的数据类型
        // 创建ArrayList集合存储student对象
        ArrayList<Student> array = new ArrayList<Student>();
        // 当前可查学生信息
        Student s1 = new Student("01", "蒋丞", "男", 20,"辽宁",135256);
        Student s2 = new Student("02", "顾飞", "男", 21,"辽宁",155234);
        Student s3 = new Student("03", "顾淼", "女", 18,"辽宁",167235);
        array.add(s1);
        array.add(s2);
        array.add(s3);

        // while(true)无限循环语句,语句块中有break语句才都能跳出循环。
        while (true) {
            System.out.println("-----学生管理系统-----");
            System.out.println("(1)添加学生信息");
            System.out.println("(2)删除学生信息");
            System.out.println("(3)更改学生信息");
            System.out.println("(4)查询学生信息");
            System.out.println("(5)退出管理系统");
            System.out.println("请选择系统功能: ");

            // 输入管理系统选项

/*
用户的输入在计算机缓冲区中是这样存储的：42\n3.1415\nWelcome to HackerRank Java tutorials!\n
使用nextInt()读取42结束，剩下\n3.1415\nWelcome to HackerRank Java
使用nextDouble()读取3.1415，剩下\nWelcome to HackerRank Java
如果此时直接用nextLine()读取，该函数遇到换行符\n就结束
所以需要在这之前输入nextLine()，去掉缓冲区的\n，然后再读取
这是由于nextLine()会读取\n之前的所有内容，并去除\n，而nextDouble()等曾不会去除它后面的\n
*/

            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addStudent(array); // 增
                    break;
                case "2":
                    removeStudent(array); // 删
                    break;
                case "3":
                    updateStudent(array); // 改
                    break;
                case "4":
                    findAllStudent(array); // 查
                    break;
                case "5": // 退出

                default:
                    System.out.println("谢谢您的使用");
                    System.exit(0);// java虚拟机退出
                    // break;

            }
        }
    }

    // 1.添加学生信息
    // public static void main(String[] args) {
    // ArrayList<Student> array = new ArrayList<Student>();
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String No;
        System.out.println("请输入学生学号：");
        // String No=sc.nextLine();
        No = sc.next(); // 输入学号No nextLine返回string类型

        // 定义标记,判断学生学号是否被占用
        boolean flag = true;

        for (int i = 0; i < array.size(); i++) {
            // 遍历学生信息返回给学生对象
            Student s = array.get(i);
            // 获取该学生的学号，和键盘录入的学号进行比较
            if (s.getNo().equals(No)) {
                flag = false;// 说明学号被占用
                System.out.println("该学生已存在，请重新输入!");
                break;
            }

        }

        if (flag) {
            System.out.println("请输入学生姓名：");
            String Name = sc.nextLine();
            System.out.println("请输入学生住址：");
            String Add = sc.nextLine();
            System.out.println("请输入学生性别：");
            String Sex = sc.nextLine();
            System.out.println("请输入学生年龄：");
            int Age = sc.nextInt();
            System.out.println("请输入学生电话：");
            int Tel = sc.nextInt();
            //nextInt必须在nextLine后面

            // 创建学生对象
            Student s = new Student();
            s.setSNo(No);
            s.setName(Name);
            s.setAdd(Add);
            s.setSex(Sex);
            s.setAge(Age);
            s.setTel(Tel);
            // 把学生对象作为元素添加到集合
            array.add(s);
            System.out.println("添加成功!");
        }
    }

    // 2.删除学生信息
    public static void removeStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号: ");
        String No = sc.nextLine(); // 键盘录入的学号返回给No

        // 作为索引
        int index = -1;
        // 遍历学生信息
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            // 获取该学生的学号，和键盘录入的学号进行比较
            if (s.getNo().equals(No)) {
                index = i; // 124行 array.remove(index);
                break;
            }

        }

        if (index == -1) {
            System.out.println("您要删除的学生信息不存在，请重新选择: ");
        } else {
            array.remove(index); // 删除获取的学生信息
            System.out.println("删除学生信息成功");

        }
    }

    // 3.修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号: ");
        String No = sc.nextLine();

        // 作为索引
        int index = -1;
        // 遍历学生信息
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            // 获取该学生的学号，和键盘录入的学号进行比较
            if (s.getNo().equals(No)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("您要修改的学生信息不存在，请您重新选择: ");
        } else { // index = i;的时候
            System.out.println("请输入学生新姓名：");
            String Name = sc.nextLine();

            System.out.println("请输入学生性别：");
            String Sex = sc.nextLine();

            System.out.println("请输入学生新住址：");
            String Add = sc.nextLine();

            System.out.println("请输入学生年龄：");
            int Age = sc.nextInt();

            System.out.println("请输入学生电话：");
            int Tel = sc.nextInt();
            // 创建学生对象
            Student s = new Student();
            // 学生对象s不调用set方法，则修改后的值为null
            s.setSNo(No);
            s.setName(Name);
            s.setSex(Sex);
            s.setAge(Age);
            s.setTel(Tel);
            s.setAdd(Add);
            // 修改学生中的集合对象
            // Arraylist集合中set方法，set(int index,Object o)覆盖元素。
            array.set(index, s);

            System.out.println("修改学生信息成功!!");
        }
    }

    // 4.查询学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        // 判断学生信息集合的长度，如果等于0，学生信息为空，程序结束
        if (array.size() == 0) {
            System.out.println("对不起，当前学生信息为空，请您重新选择: ");
            return;// 不让程序往下执行
        }
        // 学生信息列表
        System.out.println("学号:\t姓名:\t性别:\t年龄:\t住址:\t电话:");// \t是一个tab键的位置
        // 遍历集合
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);//
            System.out.println(
                    student.getNo() + "\t" + student.getName() + "\t" + student.getSex() + "\t" +student.getAge() + "\t" + student.getAdd()+ "\t" + student.getTel());
        }
    }
}