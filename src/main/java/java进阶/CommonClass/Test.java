package java进阶.CommonClass;
import java.lang.*; //自带的可以不写


/*Integer 包装类
还有其他的比如：Byte Long Character等等。。。。
 */
public class Test {
    public static void main(String[] args) {
        //属性： 输出最大范围和最小范围

        System.out.println(Integer.MAX_VALUE);  //2147483647
        System.out.println(Integer.MIN_VALUE);  //-2147483648
        //但是物极必反
        System.out.println(Integer.MAX_VALUE+1);  //-2147483648
        System.out.println(Integer.MIN_VALUE-1);  //2147483647




    }
}
