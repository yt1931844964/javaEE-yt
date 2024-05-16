package java进阶.多线程.创建线程的三种方式.Callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        return new Random().nextInt(10);
    }
}
