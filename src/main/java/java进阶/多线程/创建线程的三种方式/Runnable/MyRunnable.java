package java进阶.多线程.创建线程的三种方式.Runnable;

public class MyRunnable  implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Working..."+i);
        }
    }
}
class Test{
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
    }
}