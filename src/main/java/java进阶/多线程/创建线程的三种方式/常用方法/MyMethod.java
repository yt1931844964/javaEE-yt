package java进阶.多线程.创建线程的三种方式.常用方法;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyMethod extends Thread {
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("线程一"+i);
        }
    }

}
class MyMethod2 extends Thread{
    public void run(){
        for(int i = 10;i<20;i++){
            System.out.println("线程二"+i);
        }
    }
}
class MyMethod3 extends Thread {
    public void run() {
        for (int i = 20; i < 30; i++) {
            System.out.println("线程三" + i);
        }

    }
}
class Test {
        public static void main(String[] args) {
        Date data =new Date();
            DateFormat df = new SimpleDateFormat("HH:mm:ss"); //设置自己的格式
            Object a =df.format(data);
            try {
                Thread.sleep(10000);    //设置休眠时间（阻塞时间）
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            MyMethod mm1 = new MyMethod();
            mm1.setPriority(10);//设置优先级别，最低为1，普通为5，最高位10
            mm1.start();
            MyMethod2 mm2 = new MyMethod2();
            mm2.setDaemon(true);//设置伴随线程：先伴随再开始
            mm2.start();
            for (int i = 30; i < 40; i++) {
                System.out.println("线程三" + i);
                if(i==35){
                    MyMethod3 mm3 = new MyMethod3();
                    //当一个线程对象的join()方法被调用时，当前线程会被阻塞，直到目标线程执行完毕。也就是说，在这个方法返回之前，调用该方法的线程会一直处于阻塞状态。
                    try {
                        mm3.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    mm3.start();
                }
            }


        }
}
