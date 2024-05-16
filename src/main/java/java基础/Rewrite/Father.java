package java基础.Rewrite;

public class Father {
    private int a=25;
    public Father(){
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void best(){
        System.out.println("python是世界上最好的语言");
    }
    public  int sub(int b){
        int c;
        c=a-b;    //5
        return c;

    }
    //重载
    public int  best(int d){
        a=a+d;
        return a;
    }

}
