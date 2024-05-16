package java基础.DrinkConsumption;

//奶茶类

public class TeaMike extends Beverages {
    public static final String name = "奶茶";
    private static final int price_mid = 8;
    private static final int price_big = 12;
    private static final int price_extraBig = 15;

    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        System.out.println("请录入你需要的奶茶的信息(备注加红豆、椰果、布丁、珍珠)");

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