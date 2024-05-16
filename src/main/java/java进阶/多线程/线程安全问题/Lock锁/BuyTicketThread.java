package java进阶.多线程.线程安全问题.Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BuyTicketThread {
    public static void main(String[] args) {
       Mythread mt= new Mythread();
       Thread t1 = new Thread(mt,"窗口一");
       t1.start();
       Thread t2 = new Thread(mt,"窗口二");
       t2.start();
       Thread t3 = new Thread(mt,"窗口三");
       t3.start();
    }
}
class Mythread implements Runnable {
    Lock lock  = new ReentrantLock(); //创建对象（实现类对象）
    int  countDown = 10;//定义一共十张票:由于都是包装在Thread中的，所以不用static修饰
    public void run(){
        //总共100的人数排队
        for(int i=0;i<=100;i++){
            lock.lock();
            if(countDown>0){//说明有票
                System.out.println("我在"+Thread.currentThread().getName()+"窗口买到了第"+ countDown-- +"张票");//抢到一张票就要减一

            }
            lock.unlock();
        }
    }

}
/*
[1 Lock引入
JDK1.5后新增新一代的线程同步方式:Lock锁与采用synchronized相比，lock可提供多种锁方案，更灵活
synchronized是Java中的关键字，这个关键字的识别是靠JVM来识别完成的呀。是虚拟机级别的。但是Lock锁是API级别的，提供了相应的接口和对应的实现类，这个方式更灵活，
表现出来的性能优于之前的方式
[2] 代码演示:
[3] Lock和synchronized的区别
1.Lock是显式锁(手动开启和关闭锁，别忘记关闭锁》，synchronized是隐式锁
2.Lock只有代码块锁，synchronized有代码块镇和方法锁
3.使用Lock锁，JVM将花费较少的时间来调度线程，性能更好。并且具有更好的扩展性(提供更多的子类)
[4] 优先使用顺序:
Lock-.--同步代码块(已经进入了方法体，分配了相应资源) ----同步方法在方法体之外)
 */