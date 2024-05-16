package java进阶.DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class format {
    public static void main(String[] args) {
        //date与string互相转换
        /*
        SimpleDateFormat extends DateFormat(父类是一个抽象类)  不能够直接创建对象
         */

        //（1）先格式化
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //设置自己的格式
        //(2)String-->Date
        try{
            Date d = df.parse("2023-12-24 12:12:43");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //(3)date-->java进阶.string
        String format = df.format(new Date());   //直接创建对象放入方法中
        System.out.println(format);  //2023-04-10 02:40:58




    }
}
