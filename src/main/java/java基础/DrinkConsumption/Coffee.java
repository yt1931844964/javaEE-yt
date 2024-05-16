package java基础.DrinkConsumption;



//咖啡类

public class Coffee extends Beverages {
    public static final String name = "咖啡";
    private static final int price_mid = 11;
    private static final int price_big = 15;
    private static final int price_extraBig = 20;


    public static int getPrice_mid() {
        return price_mid;
    }

    public static int getPrice_big() {
        return price_big;
    }

    public static int getPrice_extraBig() {
        return price_extraBig;
    }

    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        System.out.println("请录入你需要的咖啡的信息（备注加奶、加冰、加糖情况）");

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