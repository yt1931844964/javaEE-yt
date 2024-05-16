package java基础.polymorphism多态;

public class YT {
    public void love(){
        System.out.println("我想要找一个人谈恋爱");
    }
    public void play(Girl girl){
        girl.advantage();   //调用girl中的子类advantage 方法
    }

}
