package java进阶.CommonClass;

public class test3 {
    public static void main(String[] args) {

        //自动装箱：将int转为integer类型
        Integer i3 = 12;
        System.out.println(i3);   //12
        //自动拆箱：将integer转为int类型
        Integer i4 = new Integer(11);
        int i5 = i4;
        System.out.println(i4);    //11


        //自动装箱和拆箱的class文件
        /*
        Integer i3 = Integer valueOf(12);
        System.out.println(i3);

        Integer i4 = new Integer(11);
        int i4 = i4.intValue();
        System.out.println(i4);
         */

    }
}
