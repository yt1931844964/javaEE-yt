package java进阶.DateTime;

import java.util.Date;

public class utilDate {
    public static void main(String[] args) {
        //创建对象
        Date d = new Date();
        System.out.println(d.toString()); //Mon Apr 10 14:06:11 CST 2023
        System.out.println(d.getYear());  //是1900+这个数
        System.out.println(d.getMonth()); //从 零开始，实际为+1

        //返回自1970年一月一日00.00.00GMT以来此date对象表示的毫秒数
        System.out.println(d.getTime());  //1681107123703（这个就是毫秒数）
        System.out.println(System.currentTimeMillis());//与上面date方法一样
        /*常用的是System里面的currentTimeMillis()方法
        因为这个方法是静态的，可以类名.方法名直接调用
         */

        //作用：测试算法耗时
        long start = System.currentTimeMillis();

        for (int i=1;i<=1000;i++){
            System.out.println("python");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start); //耗时  14


    }
}
