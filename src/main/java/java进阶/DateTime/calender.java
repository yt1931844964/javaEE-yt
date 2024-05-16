package java进阶.DateTime;

import java.util.Calendar;

public class calender {
    public static void main(String[] args) {
        //这是第二种日期类
        //这是个抽象类，要用子类创建对象或者调用方法创建对象
        Calendar ca1 = Calendar.getInstance();
        Calendar ca2 = Calendar.getInstance();
        System.out.println(ca1);
        /* 运行结果：
        java.util.GregorianCalendar[time=1681109309100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=48,SECOND=29,MILLISECOND=100,ZONE_OFFSET=28800000,DST_OFFSET=0]
         */

        //这个类常用方法  get()方法
        System.out.println(ca1.get(Calendar.YEAR));
        System.out.println(ca1.get(Calendar.MONTH));
        System.out.println(ca1.get(Calendar.DATE));    //10号
        System.out.println(ca1.getActualMaximum(Calendar.DATE)); //当月日期的最大天数  30
        System.out.println(ca1.getActualMinimum(Calendar.DATE)); //当月日期的最小天数  1
        //set（）方法，可以改变Calendar中的类容（即使是已经创建的类）
        ca1.set(Calendar.DATE,21);
        ca1.set(Calendar.MONTH,5);
        ca1.set(Calendar.YEAR,1990);
        System.out.println(ca1.get(Calendar.DATE));  //变成20了

        //转换  String-->Calendar(其实就是string->java.sql.date->Calendar)
        java.sql.Date date = java.sql.Date.valueOf("2021-4-4");
        ca2.setTime(date);
        System.out.println(ca2);
        System.out.println(ca2.YEAR+"?"+ca2.DATE+"?"+ca2.get(Calendar.MONTH)); //直接调用和get方法结果一样





    }

}
