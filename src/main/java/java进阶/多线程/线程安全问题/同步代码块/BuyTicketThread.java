package java进阶.多线程.线程安全问题.同步代码块;

public class BuyTicketThread {
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
            synchronized (run.class) {
                if (countDown > 0) {//说明有票
                    System.out.println("我在" + Thread.currentThread().getName() + "窗口买到了第" + countDown-- + "张票");//抢到一张票就要减一

                }
            }
        }
    }

}

class thr extends Thread {
    static int countDown = 10;//定义一共十张票:为了防止出现每个窗口都出现10张票，所以用static将总票数定义为10

    public thr() {
    }

    public thr(String name) {
        super.setName(name);
    }

    public void run() {
        //总共100的人数排队
        for (int i = 0; i <= 100; i++) {
            synchronized (thr.class) {
                if (countDown > 0) {//说明有票
                    System.out.println("我在" + this.getName() + "窗口买到了第" + countDown-- + "张票");//抢到一张票就要减一

                }
            }
        }
    }
/*
[3]同步监视器总结:总结1:认识同步监视器 (锁子) ----- synchronized(同步监视器1)必须是引用数据类型，不能是基本数据类型
                  2)也可以创建一个专门的同步监视器，没有任何业务含义
                  3)一般使用共享资源做同步监视器即可
                  4)在同步代码块中不能改变同步监视器对象的引用
                  5)尽量不要String和包装类Integer做同步监视器
                  6)建议使用final修饰同步监视器
总结2:同步代码块的执行过程
1)第一个线程来到同步代码块，发现同步监视器open状态，需要close,然后执行其中的代码
2)第一个线程执行过程中，发生了线程切换 (阻塞 就绪)，第一个线程失去了cpu，但是没有开锁open
3)第二个线程获取了Cpu，来到了同步代码块，发现同步监视器close状态，无法执行其中的代码，第二个线程也进入阳寒状本
4)第一个线程再次获取CPU,接着执行后续的代码: 同步代码块执行完毕，释放锁open
5)第二个线程也再次获取cpu，来到了同步代码块，发现同步监视器open状态，拿到锁并且上锁，由阻塞状态进入就绪状态，再进入运行状态，重复第一个线程的处理过程(加锁)
强调:同步代码块中能发生CPU的切换吗?能!!!但是后续的被执行的线程也无法执行同步代码块(因为锁仍close)
总结3:其他
1)多个代码块使用了同一个同步监视器(锁》，锁住一个代码块的同时，也锁住所有使用该锁的所有代码块，其他线程无法访问其中的码块
2)多个代码块使用了同一个同步监视器(锁)，锁住一个代码块的同时，也锁住所有使用该锁的所有代码块，但是没有锁住使用其他同步监视器的代码块，
其他线程有机会访问其他同步监视器的代码块
 */

}
