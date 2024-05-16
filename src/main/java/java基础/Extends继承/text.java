package java基础.Extends继承;

public class text {
    public static void main(String[] args) {
        CatSon cat=new CatSon();
        cat.setAge(15);
        cat.setName("小可爱");
        cat.setSex("母");
        cat.setSpecies("猫猫");
        cat.sleep();
        cat.rua();
        cat.act();
        System.out.println(cat.getSex());
        System.out.println(cat.getSpecies());
        System.out.println(cat.getName());
    }
}
