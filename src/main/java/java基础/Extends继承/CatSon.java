package java基础.Extends继承;

public class CatSon extends PetFather {   //子类继承于父类
    //定义子类属性
    private String species;
    //定义空构造器
    public CatSon(){
    }
    //定义封装设置和读取
    public void setSpecies(String species){
        this.species=species;
    }
    public String getSpecies(){
        return species;
    }
    //定义方法
    public void act(){
        System.out.println(species+"开始打滚");
    }

}
