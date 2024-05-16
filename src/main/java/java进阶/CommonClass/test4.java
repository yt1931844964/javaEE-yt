package java进阶.CommonClass;

public class test4 {
    public static void main(String[] args) {

        //integer里面的一些方法

        //compareTo:只返回三个值：要么是0，-1，1
        Integer i1 = new Integer(4);
        Integer i2 = new Integer(4);
        System.out.println(i1.compareTo(i2));  //0
        /*底层原理
        return (x<y)?-1:((x==y)?0:1);
         */

        //equals:Integer对object方法进行重写：比较的是底层的value的值
        Integer i3 = new Integer(5);
        Integer i4 = new Integer(4);
        System.out.println(i3==i4);  //false 因为==比较的是 ：地址值
        boolean flag = i3.equals(i4);
        System.out.println(flag);  //false


        //Integer对象通过自动装箱来完成：
        Integer i5 = 1300;
        Integer i6 = 1300;
        System.out.println(i5==i6); //false
        System.out.println(i5.equals(i6));
        /*
        如果自动装箱值在 -128~127 之间，那么对比的就是具体数值
        否则，比较的就是地址
         */

        //intValue():将Integer转化为int类型
        Integer i7 = 130;
        int a =i7.intValue();
        System.out.println(a);   //130

        //parseInt(String s) : String -> int
        int i8 = Integer.parseInt("123");
        System.out.println(i8);  //123

        //toString: Integer -> String
        Integer i9 = 150;
        System.out.println(i9.toString());   //150







    }
}
