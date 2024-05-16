package java进阶.DateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class localDateTime {
    /*
    这是第三批日期时间API（对象时间不可变，方便格式化 年份从零开始）
     */
    public static void main(String[] args) {
        //创建对象(还是不能直接创建)  abstract太抽象了,用方法创建now();
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);     //2023-04-10
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);     //15:11:53.717152800
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);  //2023-04-10T15:11:53.717152800

        //of()方法-->设定指定的时间，日期，日期加时间
        LocalDate of = LocalDate.of(2021,5,23);
        LocalTime of2 = LocalTime.of(23,23,23);
        LocalDateTime of3 = LocalDateTime.of(2121,3,23,23,12,1);
        System.out.println(of2);  //23:23:23

        //LocalDateTime细讲
        //常用的get()方法
        LocalDateTime num = LocalDateTime.now();
        System.out.println(num.getYear()); //2023
        System.out.println(num.getDayOfMonth());
        System.out.println(num.getHour());
        System.out.println(num.getMonth());    //APRIL
        System.out.println(num.getMinute());
        System.out.println(num.getSecond());

        //常用的with方法，其实也就是老版本API的set，但是不会更改对象的日期时间，本质上是创建新的对象(不可变更)
        LocalDateTime num2 = LocalDateTime.now().withMonth(5);  //这是一个新的对象
        System.out.println(num);    //2023-04-10T15:28:25.898395
        System.out.println(num2);    //2023-05-10T15:30:55.177127200,改变了月份

        //提供了加减的操作
        //加
        LocalDateTime num3 = LocalDateTime.now().plusMonths(4);
        System.out.println(num.getMonth());       //APRIL
        System.out.println(num3.getMonth());      //加了4变成AUGUST
        //减
        LocalDateTime num4 = LocalDateTime.now().minusHours(4);
        System.out.println(num);    //2023-04-10T15:35:49.672768
        System.out.println(num4);    //2023-04-10T11:35:49.673801800


        //转换：(1)按定义的标准格式
        DateTimeFormatter df1 = DateTimeFormatter.ISO_DATE_TIME;
        //LocalDatetime-->String
        LocalDateTime num5 = LocalDateTime.now();
        String now = df1.format(num5);
        System.out.println(now);   //2023-04-10T15:41:37.028294
        //String --->LocalDateTime
        TemporalAccessor parse = df1.parse("2023-04-10T15:41:37.29");
        System.out.println(parse);

        //（2）本地化相关的样式。如：ofLocalizeDateTime()
        //参数：FormatStyle.LONG/FormatStyle.MEDIUM/FormatStyle.SHORT
        /*
        FormatStyle.LONG:2020年6月25日 下午02时17分12秒
        FormatStyle.MEDIUM: 2020-11-12 12:12:12
        FormatStyle.SHORT:20-7-5 下午3:16
         */
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        //localDateTime-->String :
        LocalDateTime num6 = LocalDateTime.now();
        String st2 = df2.format(num6);
        System.out.println(st2);  //2023/4/10
        //String-->LocalDateTime
        //TemporalAccessor parse1 = df2.parse("20-7-5 下午3:12") ;
        //System.out.println(parse1);

        //(3)方式三：自定义的格式，如:ofPattern("yyyy-MM-dd hh:mm:ss")  这是以后常用的
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //LocalDateTime-->String
        LocalDateTime num7 = LocalDateTime.now();
        String st3 = df3.format(num7);
        System.out.println(st3);  //2023-04-10 04:12:36
        //String --> LocalDateTime
        TemporalAccessor parse2 = df3.parse("2020-06-15 03:22:08");
        System.out.println(parse2);  //{NanoOfSecond=0, SecondOfMinute=8, MicroOfSecond=0, MinuteOfHour=22, HourOfAmPm=3, MilliOfSecond=0},ISO resolved to 2020-06-15








    }

}
