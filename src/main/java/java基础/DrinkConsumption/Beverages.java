package java基础.DrinkConsumption;


//父类:饮料类

public class Beverages {
    private String size;
    private int num;
    private String note;
    private String ice;
    private String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public String getIce() {
        return ice;
    }
    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public void showInfo() {
    }

    public void showInfo2() {
    }

    public void money(int i) {
    }
}