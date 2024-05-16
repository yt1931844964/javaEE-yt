package java进阶.Collection.Set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class test {   //特点：唯一，无序（没有按照输入顺序输出），有序（按照升序遍历输出）
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("A");
        ts.add("D");
        ts.add("B");
        System.out.println(ts.size());
        System.out.println(ts.toString());

        //利用内部比较器
        Comparator<girl> com = new bijiao1();
        TreeSet<girl> ts1 = new TreeSet<>(com);
        ts1.add(new girl("yt", 25, 178.3));
        ts1.add(new girl("gjj", 15, 168.6));
        ts1.add(new girl("yt", 25, 178.3));
        System.out.println(ts1.size());
        System.out.println(ts1.toString());

        //利用外部比较器
        Comparator<girl> com2 = new Comparator<girl>() {   //匿名类实现比较器
            public int compare(girl g1, girl g2) {
                return g1.getAge() - g2.getAge();
            }
        };
        TreeSet<girl> ts2 = new TreeSet<>(com2);
        ts1.add(new girl("yt", 25, 178.3));
        ts1.add(new girl("gjj", 15, 168.6));
        ts1.add(new girl("yt", 25, 178.3));
        System.out.println(ts1.size());
        System.out.println(ts1.toString());








    }
}
