package java基础.StaticPrivate;

public class text {
    public static void main(String[] args) {
        Girl2 girl=new Girl2();
        // girl.age=55;        //被保护的不能直接被访问
        girl.setting(20);     //但是在方法中能直接被读取
         girl.set("郭晶晶");
        System.out.println("女孩子的年龄是："+girl.getting()+"  名字是:"+girl.get());

        Girl2 girl2=new Girl2(1000,"姚婷");  //构造器的属性不被方法影响
        //可以在构造器加this.setting(age)
        System.out.println("女孩子的年龄是："+girl2.getting()+"  名字是:"+girl2.get());


    }
}
