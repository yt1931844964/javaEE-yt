package java基础.Extends继承;

public class PetFather {
    //定义属性
    private String name;
    private int age;
    private String sex;
    //定义构造器
    public PetFather(){

    }
    //三个属性的设置和读取方法
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>=20){
            System.out.println("节哀");
        }else {
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }
    public void setSex(String sex){
        if("公".equals(sex)||"母".equals(sex)){
            this.sex=sex;
        }else{
            System.out.println("不会是宠物妖？？？？？？？？？？？？？？？？？？");
        }
    }
    public String getSex(){
        return sex;
    }
    //定义方法
    public void sleep(){
        System.out.println(name+"要睡觉觉啦");
    }
    public void rua(){
        System.out.println(name+"被狠狠的rua了");
    }
}
