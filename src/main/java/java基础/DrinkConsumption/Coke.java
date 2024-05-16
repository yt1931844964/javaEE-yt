package java基础.DrinkConsumption;


//可乐类

public class Coke extends Beverages {
    public static final String name = "可乐";
    private static final int price_mid = 5;
    private static final int price_big = 7;
    private static final int price_extraBig = 9;



    public void showInfo() {
        // TODO Auto-generated method stub
        System.out.println("请录入你需要的可乐的信息（备注可口可乐还是百事可乐，是否加冰）:");
    }

    public void money(int i) {
        switch (i) {
            case 1:
                setPrice(price_extraBig);
                break;

            case 2:
                setPrice(price_big);
                break;

            default:
                setPrice(price_mid);
                break;
        }

    }


    public void showInfo2() {
        System.out.println("订单消息:您购买了"+name+":"+getNote()+",购买的"+getSize()+",购买数量"+getNum()+"杯，价钱:"+getPrice()+"*"+getNum()+"="+getPrice()*getNum());
    }




}