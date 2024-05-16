package java进阶.多线程.创建线程的三种方式.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable(); //创建线程比较麻烦，要引入FutureTask
        FutureTask ft = new FutureTask(mc); //引入中间的
        Thread t = new Thread(ft);
        t.start();
        Object o = ft.get();  //获取线程得到的返回值
        System.out.println(o);
    }
}