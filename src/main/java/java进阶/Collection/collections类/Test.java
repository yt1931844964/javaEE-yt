package java进阶.Collection.collections类;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //Collections col = new Collections(); //不支持创建对象，因为构造器私有化了
        //里面的方法都是static修饰，直接用方法.类名调用
        //常用方法
        //addAll
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        Collections.addAll(list,"two","four","hhhh","ytr");
        System.out.println(list);
        //sort升序排序
        Collections.sort(list);
        System.out.println(list);
        //reverse降序排序
        Collections.reverse(list);
        System.out.println(list);
        //binarySearch二分查找
        System.out.println(Collections.binarySearch(list,"one"));
        //copy替换方法
        ArrayList<String> list2 = new ArrayList<>(list);
        Collections.addAll(list2, "tt", "ss");
        Collections.copy(list2,list); //将list2的内容替换到list里面去
        System.out.println(list);
        System.out.println(list2);//[four, hhhh, one, two, ytr, tt, ss]

        //fill填充
        Collections.fill(list2,"全被替换");
        System.out.println(list2);


    }
}
