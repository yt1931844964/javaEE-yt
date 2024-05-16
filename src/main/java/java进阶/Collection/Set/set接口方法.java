package java进阶.Collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class set接口方法 {
    //set接口是无序的且唯一的
    public static void main(String[] args) {
        //set接口的全部方法
        Set<String> s = new HashSet<String>();
        s.add("Hello");
        s.add("World");
        s.add("!");
        System.out.println(s.size()); //prints "2"
        s.remove("Hello");   //removes "Hello"
        System.out.println(s.size()); //prints "1"
        s.clear();            //clears the set
        System.out.println(s.isEmpty()); //prints "true"
        System.out.println(s.contains("World")); //prints "true"
        System.out.println(s.contains("Foo")); //prints "false"
        System.out.println(s.add("Hello")); //prints "true"
        System.out.println(s); //prints "[Hello, World,!]"
        System.out.println(s.addAll(new HashSet<String>(Arrays.asList("Foo", "Bar", "Baz")))); //prints "[Foo,Bar,Baz,Hello,World]"
    }

}
