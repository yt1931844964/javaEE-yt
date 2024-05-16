package java基础.Rewrite;

public class Son extends Father{
    public Son(){

    }
    //子类不满意父类的方法，自己改变
    //重写1
    public void best(){
        System.out.println("Java才是");
    }
    //重写2

    public int sub(int b) {
        int c;
        c=b-getA();   //-5
        return c;
    }
}
