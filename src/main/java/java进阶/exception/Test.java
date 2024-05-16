package java进阶.exception;

public class Test {
    private int age;
    private String sex;
    private String name;

    public Test(){

    }

    public Test(int age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex)  /*throws Exception*/ {   //throws抛出
       if("男".equals(sex)||"女".equals(sex)){
           this.sex = sex;
       }else{
           try {
               throw new Exception();
           } catch (Exception e) {
               e.printStackTrace();
           }finally{
               System.out.println("就知道错了");
           }

       }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

