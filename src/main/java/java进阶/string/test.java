package java进阶.string;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        //其实底层就是创建value数组，将字符一个一个串进去，对底层value进行赋值操作
        String ss ="abc";
        //构造器创建对象
        String s1 = new String();
        String s2 = new String("abc");
        String s3 = new String(new char[]{'a','b','c'});

        //常用方法
        String s = "abcdFH";
        System.out.println("字符串的长度："+s.length());
        System.out.println("字符串是否为空："+s.isEmpty());//false不空
        System.out.println("获取字符串的下标对应的字符为："+s.charAt(1)); //b
        System.out.println("这俩个值是否相等"+ss.equals(s));//比较值是否相等 false
        System.out.println(s.compareTo(ss)); //这个类会写在下面
        //截取字符串
        System.out.println(s.substring(3));
        System.out.println(s.substring(2,5)); //截取[2，5)
        //字符串的合并/拼接操作
        System.out.println(s.concat("nB"));
        //字符串中字符的替换
        String sss = "a-b-f-r-e-e";
        String[] str = sss.split("-");
        System.out.println(Arrays.toString(str));//[a, b, f, r, e, e]
        //全部转大小写方法
        System.out.println(s.toUpperCase()); //ABCDFH
        System.out.println(s.toLowerCase());  //abcdfh
        //去除首尾空格
        String s6 = "   a  d nn   ";
        System.out.println(s6.trim()); //a  d nn
        //toString
        System.out.println(s.toString());//abcdFH
        //转换为String 类型
        System.out.println(String.valueOf(false)); //false



    }

}

