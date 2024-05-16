package java进阶.Collection.list;

import java.util.*;

public class list {
    /*
add(E e)：在列表的末尾添加一个元素。
add(int index, E element)：在指定位置插入一个元素。
addAll(java进阶.Collection<? extends E> c)：将另一个集合中的所有元素添加到列表的末尾。
addAll(int index, java进阶.Collection<? extends E> c)：将另一个集合中的所有元素插入到指定位置。
remove(Object o)：删除列表中第一个出现的指定元素。
remove(int index)：删除指定位置上的元素。
clear()：清空列表中的所有元素。
set(int index, E element)：将列表中指定位置的元素替换为指定的元素。
get(int index)：返回列表中指定位置的元素。
indexOf(Object o)：返回指定元素在列表中第一次出现的位置。
lastIndexOf(Object o)：返回指定元素在列表中最后一次出现的位置。
isEmpty()：判断列表是否为空。
size()：返回列表中元素的数量。
toArray()：将列表转换为数组。
    */
    public static void main(String[] args) {
        //list接口是collection接口的子接口，所以可以继承collection接口方法，但是她也有自己的方法。这里只使用自己方法
        List<java.lang.constant.Constable> list = new ArrayList<>();//创建对象

        //增
        list.add(1);
        list.add(2);
        list.add(1,8);
        System.out.println("在第下标为一的位置增加一个八："+list);
        //删
        list.remove(1);
        System.out.println("删除下标为一之后的集合："+list);
        //改
        list.set(0,"被替换了");
        System.out.println("替换后"+list);
        //查（遍历）
        System.out.println("查找下标为零位置的元素："+list.get(0));
        //方法一：for循环遍历
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));

        }
        //方法二：增强for循环遍历
        for(Object o:list){
            System.out.println(o);
        }
        //方法三：java进阶.迭代器
        Iterator<java.lang.constant.Constable> it = list.iterator() ;
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
