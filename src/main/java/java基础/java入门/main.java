package java基础.java入门;

public class main {
    public static int add(int a,int b){

        int c=a+b;
        return c;
    }
    public static void main(String[] args){

        int num=add(10,20);
        System.out.println(num);
    }
    public static double max(int a,int b,double c){
        if(a<b&&b<c){
            b=a;
        }
        return a;
    }
}
