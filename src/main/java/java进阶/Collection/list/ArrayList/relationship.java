package java进阶.Collection.list.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

/*
java进阶.Collection.list.ArrayList、Vector和LinkedList都实现了List接口，是Java中常用的集合类之一。它们在底层实现上有一些区别。

ArrayList的底层是一个数组，它支持随机访问和基于索引的操作。当一个元素被添加到ArrayList时，它会被存储在底层数组的末尾。如果底层数组已满，
则会创建一个新的数组，并将旧数组中的元素复制到新数组中。这个过程称为“扩容”，默认情况下每次扩容大小是原数组大小的一半。

Vector是一个线程安全的容器，它的底层实现和ArrayList类似。与ArrayList不同的是，Vector的所有方法都使用了synchronized关键字进行同步，
使得它的线程安全性能较差。在多线程环境中，较少使用Vector，而更倾向于使用ConcurrentHashMap等线程安全的工具类。默认情况下每次扩容大小是原数组大小的一倍

LinkedList的底层是一个双向链表，它支持快速的添加和删除操作。由于LinkedList需要保存每个节点的前驱和后继节点，
因此它的内存开销要比ArrayList和Vector大。LinkedList不支持随机访问和基于索引的操作，因为没有像数组那样的随机访问机制。
但它支持快速的插入和删除操作，因为只需要修改相邻节点的指针。

java进阶.Collection.list.ArrayList、Vector和LinkedList三者的联系在于它们都实现了List接口，而且它们的元素都是有序的。
同时，它们都支持添加、删除、查找等操作。它们的区别在于底层实现机制不同，因此它们的性能特点也各不相同。
ArrayList适用于随机访问和基于索引的操作，它的性能比较好；Vector适用于简单的多线程环境，但性能较差；
LinkedList适用于快速的插入和删除操作，但内存开销较大。开发者需要根据具体应用场景选择最合适的集合类。
 */
public class relationship {
    //两者区别
    //如果是从集合的头部新增元素，java进阶.Collection.list.ArrayList 花费的时间应该比 java进阶.Collection.list.LinkedList 多，因为需要对头部以后的元素进行复制。
    public class ArrayListTest {
        public static void addFromHeaderTest(int num) {
            ArrayList<String> list = new ArrayList<String>(num);
            int i = 0;

            long timeStart = System.currentTimeMillis();

            while (i < num) {
                list.add(0, i + "沉默王二");
                i++;
            }
            long timeEnd = System.currentTimeMillis();

            System.out.println("ArrayList从集合头部位置新增元素花费的时间" + (timeEnd - timeStart));
        }
    }


    public class LinkedListTest {
        public static void addFromHeaderTest(int num) {
            LinkedList<String> list = new LinkedList<String>();
            int i = 0;
            long timeStart = System.currentTimeMillis();
            while (i < num) {
                list.addFirst(i + "沉默王二");
                i++;
            }
            long timeEnd = System.currentTimeMillis();

            System.out.println("LinkedList从集合头部位置新增元素花费的时间" + (timeEnd - timeStart));
        }

    }

    public static void main(String[] args) {
        System.out.println();
    }



}
