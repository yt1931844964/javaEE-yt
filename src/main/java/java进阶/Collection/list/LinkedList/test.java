package java进阶.Collection.list.LinkedList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//这就是一个链表
public class test {
    public static void main(String[] args) {
        //初始化链表
        LinkedList<String> list = new LinkedList();

        //增
        list.add("a");
        list.add(1,"b");
        list.add("沉默王二");
        list.add("沉默王三");
        list.add("沉默王四");
        list.addLast("b");
        list.addFirst("bab");

        //addFirst() 方法将元素添加到第一位；
        //addLast() 方法将元素添加到末尾。

        //删
        //remove()：删除第一个节点
        //remove(int)：删除指定位置的节点
        //remove(Object)：删除指定元素的节点
        //removeFirst()：删除第一个节点
        //removeLast()：删除最后一个节点
        list.removeLast();

        //改set()方法

        list.set(0, "沉默王五");

        //查
        //indexOf(Object)：查找某个元素所在的位置
        //get(int)：查找某个位置上的元素
        list.get(4);
        list.indexOf("bab");
        //for遍历
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //增强for
        for(String s:list){
            System.out.println(s);
        }
        //java进阶.迭代器
        Iterator<String> it = list.iterator() ;//实现这个接口
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //或者
        for( Iterator<String> it1 = list.iterator();it.hasNext();){
            System.out.println(it.next());
        }
        //listIterator迭代器
        ListIterator<String> it2 = list.listIterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }   //指针下移
        //listIterator迭代器逆向遍历
        while(it2.hasPrevious()){//所以要把指针上移，然后逆向遍历
            System.out.println(it2.previous());
        }




    }
}
