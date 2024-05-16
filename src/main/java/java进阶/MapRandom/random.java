package java进阶.MapRandom;

import java.util.Random;

public class random {

    public static void main(String[] args) {
        //学习Random类
        //（1）利用带参数的构造器创建对象
        Random r1=new Random(System.currentTimeMillis());
        //空参构造器创建对象
        Random r2 = new Random();
        System.out.println(r2.nextInt(10)); //取0到指定值之间的int类型值  【0，10）
        System.out.println(r2.nextDouble()); //Math.random()的底层是nextDouble()   [0.0,1.0)

        /*
        public static double random(){
            return RandomNumberGeneratorHolder.RandomNumberGenerator.nextDouble();//返回一个Random对象

        }
        public static final class RandomNumberGeneratorHolder{
            static final Random randomNumberGenerator = new Random();
            }
         */

    }
}
