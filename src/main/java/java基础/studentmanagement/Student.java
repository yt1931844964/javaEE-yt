package java基础.studentmanagement;

public class Student {
    //定义变量学号、姓名、住址
    private String no;
    private String name;
    private String add;
    private String sex;
    private int tel;
    private int age;

    public Student() {

    }

    public Student(String no, String name, String sex,int age,String add,int tel) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.add = add;
        this.tel = tel;

    }

    //学号
    public void setSNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return no;
    }
    //姓名
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //性别
    public void setSex(String sex) {
        if ("男".equals(sex) || "女".equals(sex)) {
            this.sex = sex;
        } else {
            System.out.println("error");
        }
    }

    public String getSex() {
        return sex;
    }
    //年龄
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    //住址
    public void setAdd(String add) {
        this.add = add;
    }

    public String getAdd() {
        return add;
    }
    //电话
    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getTel() {
        return tel;
    }

}



