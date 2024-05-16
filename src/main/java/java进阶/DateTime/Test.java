package java进阶.DateTime;
import java.util.Calendar;
import java.util.Scanner;

public class  Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想查看的日期：（格式：yyyy-MM-dd）");
        String strDate = sc.next();
        //首先要把这个字符串转化为calendar（先转为date,再转为calendar）
        java.sql.Date date = java.sql.Date.valueOf(strDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);  //设置时间

        //显示星期
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //获取本月最大天数，用来遍历
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        //获取当前日期中的日，用来确定位置
        int nowDay = cal.get(Calendar.DATE);
        //引入一个计数器，方便换行
        int count =0;
        //获取这个月一号是星期几
        int num =cal.get(Calendar.DAY_OF_WEEK);
        int day = num-1;//确定第一行空格数目

        //开始
        for (int i=1;i<=day;i++){
            System.out.print("\t");
        }

        count = count +day;
        for (int i =1;i<=maxDay;i++){
            if(i==nowDay){
                System.out.print("*"+i+"\t");
            }else{
                System.out.print(i+"\t");
            }
            count++;
            if(count%7==0){
                System.out.println();//换行
            }
        }

    }
}
