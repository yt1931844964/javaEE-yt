package java进阶.Collection.Set.hashset;

import java.util.HashSet;


public class test {
    public static void main(String[] args) {
        //放入String类型
        HashSet<String> hs = new  HashSet<>(); //这是无序的，也是唯一的，不能存在相同的元素
        hs.add("yt");
        hs.add("gjj");
        hs.add("520");
        hs.add("yt");
        System.out.println(hs.size());//3
        System.out.println(hs); //[520, gjj, yt]
        //放入Integer类型
        HashSet<Integer> hs2 = new HashSet<>(); //这是有序的，也是唯一的，可以存在相同的元素
        hs2.add(5);
        hs2.add(2);
        hs2.add(3);
        hs2.add(5);
        System.out.println(hs2.size());//4
        System.out.println(hs2); //[2, 3,// 5]
        //放入自定义引用类型(并不会消除重复项)
        HashSet<Student> hs3 = new HashSet<>();
        hs3.add(new Student("Jimmy", 20));
        hs3.add(new Student("Billy", 18));
        hs3.add(new Student("Minst", 21));
        hs3.add(new Student("Billy", 18));
        System.out.println(hs3.size());//4  （并没有进行比较，因为没有重写hashcode()和equals()方法）重写后就可以了
        System.out.println(hs3);//[Student{name='Billy', age=18}, Student{name='Minst', age=21}, Student{name='Jimmy', age=20}, Student{name='Billy', age=18}]
        //hashset底层原理：数组加链表==哈希表
        /*简要原理：
        HashSet是Java中的一个集合类，它是基于哈希表实现的。HashSet中存储的元素不是按照索引位置来存储的，
        而是根据元素的hashCode值来决定存储位置的。具体来说，当把一个元素放入HashSet中时，HashSet会先计算出该元素的hashCode值，
        然后根据该值来决定该元素在HashSet内部的存储位置。如果该位置上没有存储任何元素，那么该元素就可以直接存储在该位置上；
        否则，就需要使用链表或者红黑树来解决哈希冲突的问题。在Java 8之后，当链表长度达到一定阈值时，hash表会自动转换为树形结构，
        以进一步提高性能。HashSet中存储的元素必须实现hashCode()和equals()方法。
        其中，hashCode()方法返回的是一个int类型的hashCode值，这个值将用来确定该对象的存储位置；而equals()方法用来判断两个对象是否相等，
        如果两个对象相等，它们的hashCode()值也必须相等。因此，实现自定义类时必须同时重写hashCode()和equals()方法，
        以保证HashSet中存储的对象能够正确地被定位和比较。

         */



    }
}
