package java基础.toString;

public class test {
    public static void main(String[] args) {
        Phone huawei=new Phone("华为",256,"联发科");
        Phone xiaomi=new Phone("小米",256,"晓龙8888");
        equals r= new equals();
        //tostring方法返回一个“以文本方式表示”此对象的字符串
        System.out.println(huawei);  //toString.Phone@27d6c5e0
        System.out.println(xiaomi.toString());    //toString.Phone@4f3f5b24
        /*这个方法是继承于object
        getClass().getName() +'@' +Integer.toHexString(hashCode())
        getClass().getName():包名+类名的完整表示
        hashCode():将对象在堆中的地址进行哈希算法，返回一个码（哈希码）
        Integer.toHexString()  :将哈希码传入Integer.toHexString(哈希码)中，返回一个16进制的数对应的字符串

        */

        //重写tostring后的输出：Phone{brand='华为', memory=256, cpu='联发科'}
        //Phone{brand='小米', memory=256, cpu='晓龙8888'}
        huawei.relationship(r);   //类可以在方法中调用另一个类形参


    }
}
