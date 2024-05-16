package java进阶.Collection.Set.比较器;

import java.util.Comparator;

public class girl implements Comparable<girl>{
    private String name;
    private int age;
    private double height;

    public girl(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(girl o) {
        //按照年龄比较
       // return this.getAge()-o.getAge();
        //按照名字比较
       // return this.getName().compareTo(o.getName());
       //按照身高比较
       return ((Double)this.getHeight() ).compareTo((Double)o.getHeight());
    }
}
//创建外部比较器
class bijiao1 implements Comparator<girl> {
    //创建内部比较器
    public int compare(girl g1, girl g2) {
        return g1.getAge()-g2.getAge();
    }
}
class bijiao2 implements Comparator<girl>{
    public int compare(girl g1,girl g2){
        return  g1.getName().compareTo(g2.getName());
    }
}
class bijiao3 implements Comparator<girl>{
    public int compare(girl g1,girl g2){
        return ((Double)g1.getHeight()).compareTo((Double)g2.getHeight());
    }
}
class bijiao4 implements Comparator<girl>{   //年龄相同比较名字，年龄不同比较身高
    public int compare(girl g1,girl g2){
        if(g1.getAge()==g2.getAge()){
            return g1.getName().compareTo(g2.getName());
        }
        else{
            return ((Double)g1.getHeight()).compareTo((Double)g2.getHeight());

        }
    }
}
