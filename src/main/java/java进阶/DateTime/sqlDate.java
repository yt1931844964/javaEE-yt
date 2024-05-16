package java进阶.DateTime;

import java.sql.Date;

public class  sqlDate {
    public static void main(String[] args) {
        //java.sql.date
        //创建对象
        Date d = new Date(1681107123703L);  //只有有参构造器（传入long 类型）
        System.out.println(d.toString());  //2023-04-10
        /*java.util.date与java.sql.date两者区别
        util:年月日 时分秒
        sql:年月日
       （2）两者联系
        java.sql.date extends java.util.date
        */

        //java.util.date与java.sql.date互相转换
        //String-->sql.date
        java.sql.Date date = java.sql.Date.valueOf("2022-2-4");
        //sql.date-->util.date
        java.util.Date date2 = date;  //有局限性，要固定格式

        System.out.println(date2);  //2022-02-04



    }
}
