package java进阶.迭代器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: java基础
 * @description: java进阶.迭代器
 * @author: Mr.姚廷
 * @create: 2024-04-27 15:31
 **/
public class iterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("spring");
        list.add("springboot");
        list.add("springcloud");
        list.add("springcloudalibaba");
        // 添加元素到集合中
        Iterator<String> iterator = list.iterator();
        // 遍历集合
        //hasNext 方法用于检查是否还有下一个元素，next 方法用于获取下一个元素的值。
        while (iterator.hasNext()) {
            String element = iterator.next();
            //迭代器还提供了 remove 方法，用于从集合中删除当前迭代的元素。
            // 需要注意的是，该方法只能在调用 next 方法后才能调用，且每次只能调用一次。
            if ("spring".equals(element)) {
                iterator.remove();
            }
            System.out.println(element);

        }



    }
}
