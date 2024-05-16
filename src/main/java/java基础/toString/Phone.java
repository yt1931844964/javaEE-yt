package java基础.toString;

import java.util.Objects;

public class Phone extends Object {
    //属性
    private String brand;//品牌
    private int memory;//内存
    private String cpu; //处理器

    //定义构造器
    public Phone(){

    }
    public Phone(String brand,int memory,String cpu){
        this.brand=brand;
        this.memory=memory;
        this.cpu=cpu;

    }
    //setget方法

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    //重写方法   tostring 和 equals

    /*原来的父类方法

    public String toString() {
      return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    */

    @Override
    public String toString() { //重写方法
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", memory=" + memory +
                ", cpu='" + cpu + '\'' +
                '}';
    }


    /*
    equals原来的方法：
      public boolean equals(Object obj) {
            return (this == obj);
        }
    */

    @Override
    public boolean equals(Object o) {     //o就是a.equals(b)里面的b
        if (this == o) return true;       //this指的是this.对象
        if (o == null || getClass() != o.getClass()) return false; //相当于 o instanceof Phone
        ////相当于 o instanceof Phone：意思是判断o是否是Phone这个对象的实例

        Phone phone = (Phone) o;   //将o转为Phone类型

        return memory == phone.memory && Objects.equals(brand, phone.brand) && Objects.equals(cpu, phone.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, memory, cpu);
    }

    //方法
    public void relationship(equals a){  //把引用数据类型当作属性（类和类的关系）
        System.out.println("我们两个有关系");
    }
}
