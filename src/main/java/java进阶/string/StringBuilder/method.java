package java进阶.string.StringBuilder;
import java.lang.StringBuilder;
public class method {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("yt love gjj");
        //增加
        sb.append("娶你是我的梦想");
        System.out.println(sb);
        //删
        sb.delete(10,11);//删除位置在【3,6）上的字符
        System.out.println(sb);
        sb.deleteCharAt(12); //删除位置在12的字符
        System.out.println(sb);
        //改---->插入
        StringBuilder s = new StringBuilder("一二三四五六七八九十");
        s.insert(3,"插"); //在下标三的位置上插入“插”
        System.out.println(s);
        //改--》替换
        s.replace(1,2,"哈哈");
        System.out.println(s);
        s.setCharAt(3,'你');
        System.out.println(s);
        //查
        StringBuilder b = new StringBuilder("一二三四五六七八九十");
        for(int i = 0;i<=s.length();i++){
            System.out.println(b.charAt(i)+"\t");//将字符串 s 的第 i 个字符打印输出
        }
        //截取
        String str = b.substring(2,4);//截取【2，6）返回一个新的String，对StringBuilder没有影响
        System.out.println(str);

    }
}
