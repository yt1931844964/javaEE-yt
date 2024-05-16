package java基础.toString;

public class equals {
    public static void main(String[] args) {
        //属性
        Phone apple = new Phone("苹果",128,"苹果");
        Phone meizu = new Phone("魅族",256,"天机");
        Phone maizu = new Phone("魅族",256,"天机");

        System.out.println(apple==meizu);  // == 比较两个地址的 "值" ,地址都是不相同的     false
        //a.equals(b) 底层代码就是 ==，推荐重写
        System.out.println(apple.equals(meizu));      //false

        //重写后的equals（）方法会判断地址的值而不是地址
        System.out.println(meizu.equals(maizu));      //true





    }
}
