package java基础.DrinkConsumption;


//购买系统

import java.util.Scanner;

public class Buy{
    public static void main(String[] args) {
        System.out.println("请录入你要购买的饮品：1.可乐 2.咖啡 3.奶茶");
        /*
         * 输入要购买的饮品序号
         */
        Scanner sc = new Scanner(System.in);

        Beverages beverages = Drink.getBeverages(sc.nextInt());
        beverages.showInfo();

        /*
         * 输入备注
         */
        beverages.setNote(sc.next());

        /*
         * 输入饮料大小
         */
        System.out.println("选择： 1.超大杯 2.大杯 3.中杯");
        switch (sc.nextInt()){
            case 1:
                beverages.setSize("超大杯");
                beverages.money(1);
                break;

            case 2:
                beverages.setSize("大杯");
                beverages.money(2);
                break;

            default:
                beverages.setSize("中杯");
                beverages.money(3);
                break;
        }

        /*
         * 输入购买数量
         */
        System.out.println("请输入购买数量");
        beverages.setNum(sc.nextInt());

        //输出订单消息
        beverages.showInfo2();
    }
}