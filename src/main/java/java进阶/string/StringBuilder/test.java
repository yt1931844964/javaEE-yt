package java进阶.string.StringBuilder;
/*
可变与不可变
不可变：在地址不变的情况下，想增加字符串，String只能开辟一个新的数组，所以地址变了
可变：java进阶.string.StringBuilder java进阶.string.StringBuffer:可以在地址不变情况下，直接增加数组长度
 */

public class test {
    public static void main(String[] args) {
        /*
        stringBuild底层原理:  char[] value;  int count;
        count：指的是value数组中被使用的长度
        value：这是底层的存储
         */

        //创建对象
        StringBuilder sb1 = new StringBuilder(); //空参构造器，底层对value初始化，长度设置为16
        StringBuilder sb2 = new StringBuilder(7);//开辟一个长度为7的空间，实际为16+7
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb.append("hhh").append("fgf"));
        /*
        java进阶.string.StringBuilder 的 setLength() 方法的源代码如下（Java 8）：//增加空间长度

         public void setLength(int newLength) {
              if (newLength < 0)
              throw new StringIndexOutOfBoundsException(newLength);
               ensureCapacityInternal(newLength); // 确保字符数组长度足够
              if (count < newLength) {
              Arrays.fill(value, count, newLength, '\0'); // 将新增部分的字符都填充为空字符
             }
               count = newLength; // 更新 java进阶.string.StringBuilder 内部计数器 count
              }
注释如下：

if (newLength < 0)：若指定的字符串长度小于 0，就抛出字符串索引越界异常。
ensureCapacityInternal(newLength)：调用 ensureCapacityInternal() 方法确保字符数组长度足够。
if (count < newLength)：如果新的长度大于原有长度，则需要将新增部分的字符填充为空字符。
Arrays.fill(value, count, newLength, '\0')：将 java进阶.string.StringBuffer 内部的字符数组 value 中，从原有长度 count 开始填充到新的长度 newLength，填充的字符为 \0，即空字符。
count = newLength：将 java进阶.string.StringBuilder 内部计数器 count 更新为新的长度。
         */


    }
}
