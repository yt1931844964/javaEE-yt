package java基础.DrinkConsumption;


//饮料工厂

public class Drink {
    //提供饮料
    public static Beverages getBeverages(int i){
        Beverages beverages = null ;
        if(i==1){
            beverages = new Coke();
        }
        if(i==2){
            beverages = new Coffee();
        }
        if (i==3){
            beverages = new TeaMike();
        }

        return beverages;

    }
}