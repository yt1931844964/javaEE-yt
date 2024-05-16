package java基础.StaticPrivate;

public class Girl2 {
     private String name;
    private int age;  //封装

    public Girl2(){
        //构造器
    }
    public Girl2(int age,String name){
        this.age=age;
        this.name=name;
        //this.setting(age);   //现在构造器中的属性可以方法设置影响了
        this.set(name);
    }
    //设置方法
    public void setting(int age){
        if(age>=30&&age<=100){
            this.age=18;
            System.out.println("姐姐永远18");
        }else if(age>100){
            System.out.println("解锁死人成就");
        }else{
            this.age=age;
        }
    }
    //读取方法
    public int getting(){
        return age;  //方法可以直接读取被保护的
    }
    //设置名字封装
    public void set(String name){
        if("郭晶晶".equals(name)||"姚婷".equals(name)){
            this.name=name;
        }else{
            System.out.println("主人不是这个");
        }

    }
    //读取名字
    public String get(){
        return name;
    }


}
