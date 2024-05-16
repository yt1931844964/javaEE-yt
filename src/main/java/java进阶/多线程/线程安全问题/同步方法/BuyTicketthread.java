package java进阶.多线程.线程安全问题.同步方法;

public class BuyTicketthread {
    public static void main(String[] args) {
       run t= new run();
        Thread t1 =new Thread(t,"a");
        t1.start();
        Thread t2 =new Thread(t,"b");
        t2.start();
        Thread t3 =new Thread(t,"c");
        t3.start();


    }
}

class run implements Runnable {
    int countDown = 10;//定义一共十张票:由于都是包装在Thread中的，所以不用static修饰

    public void run() {
        //总共100的人数排队
        for (int i = 0; i <= 100; i++) {

            buy();
        }
    }
    public synchronized void buy(){
        if (countDown > 0) {//说明有票
            System.out.println("我在" + Thread.currentThread().getName() + "窗口买到了第" + countDown-- + "张票");//抢到一张票就要减一

        }
    }

}
/*
总结1:多线程在争抢资源，就要实现线程的同步就要进行加锁，并且这个锁必须是共享的，必须是唯一的。咱们的锁一般都是引用数据类型的。
        目的:解决了线程安全问题。
        总结2:关于同步方法
        1) 不要将run(定义为同步方法
        2)非静态同步方法的同步监视器是this
        静态同步方法的同步监视器是 类名class 字节码信息对象
        3)同步代码块的效率要高于同步方法原因:同步方法是将线程挡在了方法的外部，而同步代码块锁将线程挡在了代码块的外部，但是却是方法的内部
        4) 同步方法的锁是this，一旦锁住一个方法，就锁住了所有的同步方法，同步代码块只是锁住使用该同步监视器的代码块，而没有锁住使用其他监视器的代码块

 */