package java进阶.CommonClass;

public class test2 {
    public static void main(String[] args) {

        //构造器（这个包装类没有空参构造器）：也就是说不能这样写：Integer a = new Integer();

        Integer i1 = new Integer(10);   //被弃用了
        //toString()被重写了
        System.out.println(i1.toString());      //底层就是this.value = value；
        Integer i2 = new Integer("100");
        System.out.println(i2);     //100    //将字符串转换为int类型，看下面构造器
        /*
        public Integer(String s)throws NumberFormatException{   //当传入的字符串没法转变会抛出异常
                this.value = parseInt(s) //将字符串转为int类型
        }
         */



    }
}
