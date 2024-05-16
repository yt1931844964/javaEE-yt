package java基础.polymorphism多态;

public class Student {
    //简单工厂模式
    public  static Girl getGirl(String name){  //多态的应用场合

        Girl a = null; //创建局部变量并且初始化
        if("郭晶晶".equals(name)){     //name.equals("郭晶晶") 容易发生空指针异常
            a=new gjj();
        }
        else if("罗哥哥".equals(name)){
            a= new lgg();
        }

        return a; //返回一个Girl类型的
    }

}
