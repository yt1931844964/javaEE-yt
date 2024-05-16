package java进阶.Collection.list.ArrayList;
//java进阶.Collection.list.ArrayList 实现了 List 接口，并且是基于数组实现的
//java进阶.Collection.list.ArrayList 在数组的基础上实现了自动扩容，并且提供了比数组更丰富的预定义方法（各种增删改查），非常灵活
import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        //创建Arraylist
        ArrayList <String> list = new ArrayList<String>();
        //设置初始大小的ArrayList;
        ArrayList <String> alist = new ArrayList<>(20);  //可以有效地避免在添加新的元素时进行不必要的扩容。
        //添加元素
        alist.add("我好棒");
        alist.add(0, "沉默王三");
        //通过 add(int index, E element) 方法把元素添加到 java进阶.Collection.list.ArrayList 的指定位置
        alist.add(1,"顶呱");
        //更新元素
        alist.set(0,"西瓜");
        //remove(int index) 方法用于删除指定下标位置上的元素
        alist.remove(1);  //根据下标删除
        alist.remove("西瓜");  //有相同元素时，只会删除第一个。

        //正序查找一个元素，可以使用 indexOf() 方法；如果要倒序查找一个元素，可以使用 lastIndexOf() 方法
        alist.indexOf(1);
        alist.lastIndexOf("哈哈");

        //二分查找法
        //Collections.sort()方法来排序
        ArrayList<String> copy = new ArrayList<>(alist);
        copy.add("a");
        copy.add("c");
        copy.add("b");
        copy.add("d");
        Collections.sort(copy);
        System.out.println(copy);
        //排序之后来查找
        int index = Collections.binarySearch(copy, "b");

        /*
        时间复杂度：
        1.查询： O(1)
        2.插入：添加一个元素（调用 add() 方法时）的时间复杂度最好情况为 O(1)，最坏情况为 O(n)。
        如果在列表末尾添加元素，时间复杂度为 O(1)。
        如果要在列表的中间或开头插入元素，则需要将插入位置之后的元素全部向后移动一位，时间复杂度为 O(n)。
        3.删除：删除一个元素（调用 remove(Object) 方法时）的时间复杂度最好情况 O(1)，最坏情况 O(n)。
        如果要删除列表末尾的元素，时间复杂度为 O(1)。
        如果要删除列表中间或开头的元素，则需要将删除位置之后的元素全部向前移动一位，时间复杂度为 O(n)
        4.修改：o(1)

         */


    }




}
