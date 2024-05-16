package java进阶.多线程.创建线程的三种方式.Runnable;

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
    int  countDown = 10;//定义一共十张票:由于都是包装在Thread中的，所以不用static修饰
    public void run(){
        //总共100的人数排队
        for(int i=0;i<=100;i++){
            if(countDown>0){//说明有票
                System.out.println("我在"+Thread.currentThread().getName()+"窗口买到了第"+ countDown-- +"张票");//抢到一张票就要减一

            }
        }
    }

}
