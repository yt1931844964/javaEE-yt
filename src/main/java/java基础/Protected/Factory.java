package java基础.Protected;
/*
在 Java 中，共有四种访问修饰符用于控制类、变量、方法的访问权限，它们分别是：

private：私有的，只能在类内部进行访问。如果一个变量或方法被定义为私有的，则只有在类中才能访问该变量或方法，子类和其他类都不能访问。

default（默认）：如果没有使用任何访问修饰符，则表示默认的访问修饰符。在同一包中，所有类都可以访问该类的成员，但是在其他包中，
该类的成员不能被访问。

protected：受保护的，可以被同一包中的其他类访问，也可以被不同包中的子类访问。

public：公共的，可以被同一个包或不同包中的所有类访问。

这些访问修饰符可以用于控制类成员的访问权限，以实现封装。通常情况下，我们将类的属性声明为 private，然后提供公有的 getter 和 setter
方法来对其进行访问和修改。这样可以通过控制访问权限来保护数据，避免数据被外部直接访问或修改，从而提高程序的健壮性和安全性。
 */
public class Factory {

    //除了public都需要提供set get接口才能访问
    private int a; //只能在同一个类下访问
    private double b;    //default（可省略），只能在同一个类和同一个包里面访问
    private float c; //只能在同一个类和同一个包和子类里面访问
    private boolean d;  //所有类里面都可以访问
    public Factory(){
        //构造器
    }
    public void setA(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }


    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public boolean isD() {
        return d;
    }

    public void setD(boolean d) {
        this.d = d;
    }
}
