package java进阶.多线程.死锁问题;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread extends Thread{
    public int flag=1;
    static Object o1=new Object(),o2=new Object();
    Lock lock  = new ReentrantLock();
    public void run(){
        System.out.println("flag=="+flag);
        //当flag锁住
        if(flag==1){
            synchronized (o1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (o2){
                    System.out.println("2");
                }
            }

        }
        if(flag==2){
            synchronized (o2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (o1){
                    System.out.println("1");
                }
            }

        }


    }

    public static void main(String[] args) {  //会产生死锁，程序一直运行
        TestThread tt1= new TestThread();
        TestThread tt2=new TestThread();
        tt1.flag=1;
        tt2.flag=2;
        tt1.start();
        tt2.start();
    }

}
/*
这段代码演示了多线程中的死锁问题。死锁是指两个或多个线程被无限地阻塞，它们在等待彼此持有的资源，而资源又无法被释放。

在这个例子中，创建了两个TestThread对象tt1和tt2，并且每个对象都有一个flag属性，用来控制线程执行的顺序。在main方法中，将tt1和tt2的flag设置为不同的值，
并分别启动两个线程。

当线程运行时，如果flag等于1，则首先锁住o1对象，然后再锁住o2对象。如果flag等于2，则首先锁住o2对象，然后再锁住o1对象。

假设线程1已经锁住了o1对象，线程2已经锁住了o2对象。但是线程1想要锁住o2对象，而线程2想要锁住o1对象，两个线程都不能得到对方所持有的锁，
于是就会陷入无限等待的状态，发生死锁。

解决死锁问题的方法包括避免嵌套锁、按照相同的顺序获取锁、限制锁持有时间等。在这个例子中，可以使用Lock接口和ReentrantLock类代替synchronized关键字来实现锁定，
同时按照相同的顺序获取锁，避免死锁的发生。





 */