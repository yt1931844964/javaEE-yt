package java基础.Rewrite;

public class text {
    //方法的重写和重载
    /*
           位置            修饰符          返回值            方法名         参数       抛出异常        方法体
    重载    同一个类中       无关            无关              必须相同      必须不同     无关           不同
    重写    子类父类中       父类的权限       父类的返回值        必须相同      必须相同     小于等于        不同
                          修饰符要低于      类型大于子类
                          子类
     */

    public static void main(String[] args) {
        Son a=new Son();
        a.best();
        a.sub(20);
        System.out.println(a.sub(20));

    }
}
