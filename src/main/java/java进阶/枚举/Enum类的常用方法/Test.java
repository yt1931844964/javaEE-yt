package java进阶.枚举.Enum类的常用方法;

public class Test {
    public static void main(String[] args) {
        //toString() 获取对象名称
        Person yes = Person.yesterday;
        System.out.println(yes.toString());
        //values()  :返回枚举对象数组
        Person[] values = Person.values();
        //遍历
        for(Person p :values){
            System.out.println(p);

        }
        //valueOf();通过对象名字获取这个枚举对象（名字要正确）
        Person to = Person.valueOf("today");
        System.out.println(to);


    }
}
