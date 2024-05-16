package java进阶.Map接口.treeMap;

import java.util.Map;
import java.util.TreeMap;

/*
TreeMap是基于红黑树实现的，它可以根据键来排序元素，因此TreeMap可以保证元素是有序的。
TreeMap提供了一些方法，如firstKey()和lastKey()，用于获取最小值和最大值。同时，它还提供了一些与排序相关的方法，
如subMap()、headMap()和tailMap()，用于获取部分元素。
相比HashMap，元素在TreeMap中的插入、删除和查找操作要稍微慢一些，但对于对元素顺序有要求的情况下，使用TreeMap会更合适。

 */
public class test {

    public static void main(String[] args) {
        Map<String,Integer> map  = new TreeMap<>();
        map.put("eyt",31);
        map.put("cyt",29);
        map.put("ayt",31);   //主键还是第一次录入的，但是值变成第二次录入的值
        map.put("dyt",31);
        map.put("byt",30);
        //独有的方法
        map.forEach((k,v) -> System.out.printf("%s ->%d\n", k, v));
        System.out.println();
        //获取最小的key
        System.out.printf("first key:%s\n", ((TreeMap<String, Integer>) map).firstKey());
        //获取最大的key
        System.out.printf("last key:%s\n", ((TreeMap<String, Integer>) map).lastKey());
        //获取部分key
        System.out.printf("subkey from:%s, to:%s\n", ((TreeMap<String, Integer>) map).subMap("byt", "cyt").keySet(), ((TreeMap<String, Integer>) map).subMap("cyt", "dyt").keySet());
        //获取部分value
        System.out.printf("subvalue from:%s, to:%s\n", ((TreeMap<String, Integer>) map).subMap("byt", "cyt").values(), ((TreeMap<String, Integer>) map).subMap("cyt", "dyt").values());


    }
}
