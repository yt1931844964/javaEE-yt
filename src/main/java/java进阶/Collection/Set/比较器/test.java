package java进阶.Collection.Set.比较器;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {  //都要实现返回int数据类型
        //比较int类型数据
        int a = 1;
        int b = 2;
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        if (a < b) {
            System.out.println(a + " is less than " + b);
        }
        if (a == b) {
            System.out.println("" + a + " is equal to " + b);
        }
        //比较double类型数据（由于Double包装类实现了compareTo接口，所以直接用接口比较）
        double c = 1.0;
        double d = 2.0;
        System.out.println(((Double)c).compareTo((Double)d));

        //比较String类型数据
        String e = "姚廷";
        String f = "郭晶晶";
        System.out.println(e.compareTo(f));

        //实现模拟自写compare接口的比较器(内部比较器)
        girl gjj = new girl("gjj",18,168.5);
        girl lyf = new girl("lyf",36,170.5);
        System.out.println(gjj.compareTo(lyf)); //比较身高

        //实现模拟自写compare接口的比较器(外部比较器)
        Comparator bj= new bijiao1();  //这是一个多态
        Comparator bj1= new bijiao2();  //这是一个多态
        Comparator bj2= new bijiao3();  //这是一个多态
        System.out.println(bj.compare(gjj,lyf));//age
        System.out.println(bj1.compare(gjj,lyf));//name
        System.out.println(bj2.compare(gjj,lyf));//height

        //使用匿名类实现比较器
        List<girl> list = new ArrayList<>();
        list.add(new girl("Tom", 18,164.5));
        list.add(new girl("Jerry", 20,144.5));
        list.add(new girl("Bob", 15,155.8));

        // 使用匿名类比较器对Student对象进行按年龄从小到大排序
        Collections.sort(list, new Comparator<girl>() {
            @Override
            public int compare(girl o1, girl o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (girl s : list) {
            System.out.println(s.getName() + " " + s.getAge());
        }
    }
}



