package java基础.StaticPrivate;
//静态方法最先被加载的
public class Girl {
    private int age;  //被封装的age ,不能直接被访问，但是可以在方法中被访问
    static String name;
    double height;

    public Girl(){
        //这是一个空的构造器
    }
    public void dong(){
        System.out.println("这是一个动态方法");
    }
    public static void sta(){     //public与static都是修饰符，顺序不重要
        //System.out.println(age);   //静态方法不能使用非静态属性
       // this.age=age;    //静态方法不能使用this关键字
        System.out.println("这是一个静态方法");
    }

    public static void main(String[] args) {
        Girl girl1=new Girl();
        Girl.name="宝宝";     //静态方法可任意直接被调用
        System.out.println(name);
    }
}
