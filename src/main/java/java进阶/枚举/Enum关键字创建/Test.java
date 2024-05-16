package java进阶.枚举.Enum关键字创建;

import java进阶.枚举.自定义枚举.Season;

public class Test {
    public static void main(String[] args) {
        Season spring =  Season.SPRING;
        System.out.println(spring);

        Person yes = Person.yesterday;
        System.out.println(yes);
        Person[] values =Person.values();
        //遍历
        for(Person p :values){
            System.out.println(p);

        }


    }
}
