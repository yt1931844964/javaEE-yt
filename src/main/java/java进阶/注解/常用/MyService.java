package java进阶.注解.常用;

import java.util.ArrayList;
import java.util.List;

public class MyService {

    // 标识一个方法已经过时不再推荐使用
    @Deprecated
    public void oldMethod() {
        // do something
    }

    // 告诉编译器对于特定的警告，不产生编译器警告信息
    @SuppressWarnings("unchecked")
    public List<Object> getList() {
        return new ArrayList();
    }

    // 标识一个方法是重写父类的方法
    @Override
    public int hashCode() {
        // do something
        return 4;
    }

    // 标识一个接口是函数式接口，即只包含一个抽象方法的接口
    @FunctionalInterface
    public interface MyInterface {
        void doSomething();
    }

    // 标识一个方法是安全的可变参数方法
    @SafeVarargs
    private static <T> List<T> asList(T... a) {
        List<T> list = new ArrayList<>();
        for (T o : a)
            list.add(o);
        return list;
    }

    // 标识一个参数或返回值可能为空或不为空
    //public void myMethod(@Nullable String str, @NonNull Object obj) {
        // do something
   // }

}
