package java进阶.多线程.创建线程的三种方式.MyThread;

public class BuyTicketThread {
    public static void main(String[] args) {
        Mythread t1 = new Mythread("A");
        t1.start();
        Mythread t2 = new Mythread("B");
        t2.start();
        Mythread t3 = new Mythread("C");
        t3.start();
    }
}
class Mythread extends Thread{
    static int  countDown = 10;//定义一共十张票:为了防止出现每个窗口都出现10张票，所以用static将总票数定义为10
    public Mythread(){}
    public Mythread(String name){
        super.setName(name);
    }
    public void run(){
        //总共100的人数排队
        for(int i=0;i<=100;i++){
            if(countDown>0){//说明有票
                System.out.println("我在"+this.getName()+"窗口买到了第"+ countDown-- +"张票");//抢到一张票就要减一

            }
        }
    }

}
