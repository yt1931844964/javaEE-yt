package java进阶.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @program: javaEE
 * @description:
 * @author: Mr.姚廷
 * @create: 2024-05-16 17:09
 **/
public class streamCreate {
    public static void main(String[] args) {
        /**
         * 用集合创建流
         */
        // permissionList指所有权限列表
        List<UmsPermission> permissionList = new ArrayList<>();
        // 为集合创建串行流对象
        Stream<UmsPermission> stream = permissionList.stream();
        // 为集合创建并行流对象
        Stream < UmsPermission > parallelStream = permissionList.parallelStream();
        /**
         * 用数组创建流
         */
        int[] array={1,3,5,6,8};
        IntStream streamArr = Arrays.stream(array);
        /**
         * 用生成器创建流
         */
        Stream<String> streamGen = Stream.generate(() -> "hello");
        /**
         * 用迭代器创建流
         */
        Stream<String> streamIter = Stream.iterate("hello", s -> s + "hello");
        /**
         * 用Builder创建流
         */
        Stream streamBuilder = Stream.builder().add("hello").add("world").build();
        /**
         * 用静态源创建流
         */
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6);
        stream1.forEach(System.out::println);
        Stream<Integer> stream2 = Stream.iterate(0, (x) -> x + 3).limit(4);
        stream2.forEach(System.out::println);

        Stream<Double> stream3 = Stream.generate(Math::random).limit(3);
        stream3.forEach(System.out::println);


    }
}
