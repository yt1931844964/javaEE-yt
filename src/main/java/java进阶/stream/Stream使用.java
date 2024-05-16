package java进阶.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.groupingBy;

/**
 * @program: javaEE
 * @description:
 * @author: Mr.姚廷
 * @create: 2024-05-16 17:20
 **/
public class Stream使用 {
    public static void main(String[] args) {
        /**
         * 遍历 匹配
         */
        List<Integer> list = Arrays.asList(7, 6, 9, 3, 8, 2, 1);

        // 遍历输出符合条件的元素
        list.stream().filter(x -> x > 6).forEach(System.out::println);
        // 匹配第一个
        Optional<Integer> findFirst = list.stream().filter(x -> x > 6).findFirst();
        // 匹配任意（适用于并行流）
        Optional<Integer> findAny = list.parallelStream().filter(x -> x > 6).findAny();
        // 是否包含符合特定条件的元素
        boolean anyMatch = list.stream().anyMatch(x -> x > 6);
        System.out.println("匹配第一个值：" + findFirst.get());
        System.out.println("匹配任意一个值：" + findAny.get());
        System.out.println("是否存在大于6的值：" + anyMatch);
        System.out.println("_____________________________________________");
        /**
         * 过滤filter
         * 过滤出大于6的值
         */
        list.stream().filter(x -> x>6).forEach(System.out::println);
        System.out.println("_____________________________________________");
        /**
         * 聚合
         */
        //获取最长的元素
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println("最大值：" + max.get());
        //获取最小的元素
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        System.out.println("最小值：" + min.get());
        //求和
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println("求和：" + sum);
        //求平均值
        double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("平均值：" + avg);
        // 获取大于6的元素个数
        long count = list.stream().filter(x -> x > 6).count();
        System.out.println("list中大于6的元素个数：" + count);
        System.out.println("_____________________________________________");
        /**
         * 映射map
         */
        // 将list中的元素转换为字符串
        list.stream().map(String::valueOf).forEach(System.out::println);
        System.out.println("_____________________________________________");
        /**
         * 排序
         */
        // 排序
        list.stream().sorted().forEach(System.out::println);
        System.out.println("_____________________________________________");
        /**
         * 分组
         */
        // 分组
        list.stream().collect(groupingBy(x -> x % 2 == 0 ? "偶数" : "奇数")).forEach((k, v) -> System.out.println(k + ":" + v));
        System.out.println("_____________________________________________");
        /**
         * 合并
         */
        // 合并
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> list3 = Arrays.asList(11, 12, 13, 14, 15);
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.stream().flatMap(x -> x.stream()).forEach(System.out::println);
        System.out.println("_____________________________________________");
        /**
         * 限制
         */
        // 限制
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("_____________________________________________");
        /**
         * 跳过
         */
        // 跳过
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("_____________________________________________");
        /**
         * 并行流
         */
        // 并行流
        list.parallelStream().forEach(System.out::println);


    }

}
