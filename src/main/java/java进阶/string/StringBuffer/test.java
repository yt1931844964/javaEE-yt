package java进阶.string.StringBuffer;

public class test {
    public static void main(String[] args) {
        //创建对象
        StringBuffer sb1 = new StringBuffer(); //空参构造器，底层对value初始化，长度设置为16
        StringBuffer sb2 = new StringBuffer(7);//开辟一个长度为7的空间，实际为16+7
        StringBuffer sb = new StringBuffer("abc");
        System.out.println(sb.append("hhh").append("fgf"));
    }
}
