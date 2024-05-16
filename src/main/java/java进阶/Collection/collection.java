package java进阶.Collection;

import java.util.*;
import java.util.List;

public class collection {
           /*add(E e)：向集合中添加一个元素。
             addAll(java进阶.Collection<? extends E> c)：向集合中添加另一个集合中的所有元素。
             remove(Object o)：从集合中删除指定的元素。
             removeAll(java进阶.Collection<?> c)：从集合中删除另一个集合中包含的所有元素。
             clear()：清空集合中的所有元素。
             contains(Object o)：判断集合是否包含指定的元素。
             isEmpty()：判断集合是否为空。
             size()：返回集合中元素的数量。
             iterator()：返回迭代器对象，可以用来遍历整个集合。
              toArray()：将集合转换为数组。
              retainAll(java进阶.Collection<?> c)：保留指定集合中包含的所有元素，删除其他元素。
              equals(Object o)：比较两个集合是否相等。
             hashCode()：返回集合的哈希码。
             stream()：返回一个流，可以用来对集合中的元素进行操作。*/
           public static void main(String[] args) {
               Collection col = new ArrayList();//创建对象：接口不可以创建对象，所以可以用实现类创建对象
               //集合有一个特点：只能存放引用数据类型的数据，不能使用基本数据类型（由于基本数据类型自动装箱，所以不会报错）
               //增
               col.add(45);
               col.add(12);
               col.add(56);
               System.out.println("这是增加之后的："+col.toString());
               List<Integer> list  = Arrays.asList(new Integer[]{1,2,3,5,74,5,7});
               col.addAll(list);
               System.out.println("这是增加全部之后的："+col.toString());
               //删
               //col.clear();//清空集合
               System.out.println("集合中元素的数量为："+col.size());

               //判断
               System.out.println("判断集合是否为空"+col.isEmpty());//判断集合是否为空
               Boolean isRemove = col.remove(45);
               System.out.println(col);
               System.out.println("集合中元素是否被删除："+isRemove);
               System.out.println("两个内部元素是否都相等："+col.equals(list));
               //查（遍历）//普通for循环没有办法进行遍历
               //方法一：增强for循环
               for(Object o : col){   //循环迭代的过程中会依次将col中的每一个元素赋值给变量o，然后在循环体中对变量o进行处理
                   System.out.println(o);
               }

               //方法二：iterator
               //获取一个迭代器对象，用于遍历集合col中的元素。iterator()方法返回的是一个实现了Iterator接口的对象，可以使用该对象依次访问集合中的每一个元素。
               Iterator it = col.iterator(); //java进阶.迭代器
               while(it.hasNext()){//当集合col中还有未被遍历到的元素时，执行循环体中的代码。hasNext()方法返回值为布尔类型，如果还有下一个元素，返回true；否则返回false。
                   System.out.println(it.next());//获取集合中的下一个元素，next()方法返回操作后的当前元素，同时指针向后移动一位。
               }


           }

}
