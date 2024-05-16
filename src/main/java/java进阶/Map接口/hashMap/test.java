package java进阶.Map接口.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


        /*HashMap是基于哈希表实现的，它可以通过键值对的方式存储和访问元素，提供了O(1)的常数时间复杂度进行插入、删除和查找操作，
        具有很好的性能。
        HashMap的缺陷是不保证元素的顺序，也不保证迭代的顺序与元素的插入顺序相同。
         这是因为HashMap中的元素是根据其哈希码放置到桶中的，而桶的顺序并不一定和元素的插入顺序相同。
        */

public class test {
            public static void main(String[] args) {    //map<key,value>主键和值的映射
                Map<String,Integer> map = new HashMap<>();
                //map方法
                //增加
                map.put("张三",31);
                map.put("王五",29);
                map.put("张三",31);   //主键还是第一次录入的，但是值变成第二次录入的值
                map.put("陈 820",31);
                map.put("康威",30);
                Map<String,Integer> map2= new HashMap<>();
                //map方法
                //增加
                map2.put("张三",31);
                map2.put("王五",29);
                map2.put("张三",31);   //主键还是第一次录入的，但是值变成第二次录入的值
                map2.put("陈 820",31);
                map2.put("康威",30);
                System.out.println(map.size());
                System.out.println(map.toString());
                //删除
                // map.clear();全部删除
                map.remove("张三");//操作都是针对于key
                System.out.println(map.size());
                System.out.println(map.toString());
                //判断
                System.out.println(map.containsKey("张三"));//    是否包含key
                System.out.println(map.containsValue(31));//是否包含值
                System.out.println(map.equals(map2));//值是否相等
                map.isEmpty();//是否为空

                //查看
                map.entrySet();//获取到entrySet
                map.get("张三");//获取到值
                map.keySet();//获取到所有的key
                map.values();//获取到所有的值

                //遍历
                System.out.println("----------------加强for遍历----------------" +
                        "遍历values");
                Collection<Integer> a =map.values();
                for(Integer value:a){
                    System.out.println(value);
                }
                System.out.println("----------------加强for遍历----------------" +
                        "遍历key");
                Collection<String> b =map.keySet();
                for(String key:b){
                    System.out.println(key);
                }
                System.out.println("----------------加强for遍历----------------" +
                        "遍历全部");
                Set<Map.Entry<String,Integer>> entries = map.entrySet();
                for(Map.Entry<String,Integer> entry:entries){
                    System.out.println(entry);
                }
            }
        }


