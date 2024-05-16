package java进阶.多线程.生产者消费者问题.Lock锁;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Products {  //商品类
    private String brand;
    private String name;
    Boolean flag=false;
    //声明lock锁
    Lock lock = new ReentrantLock();
    //创建锁池
    Condition sc = lock.newCondition();
    Condition xf = lock.newCondition();

    Products(){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 消费者从商品中取出内容的方法
    public synchronized void xfz() throws InterruptedException {
        lock.lock();
     try{
         if(flag==false){
             xf.await();
         }
         System.out.println("我看了："+this.getBrand()+"---"+this.getName());
         flag=false;
         xf.signal();

     }finally {
         lock.unlock();

     }
     }


    // 生产者向商品中添加内容的方法
    public synchronized void scz(){
       lock.lock();
       try{
           if(flag==true){
               try {
                   sc.await();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
           this.setBrand(brand);
           this.setName(name);
           flag=true;
           System.out.println(this.getBrand()+"写了："+"----"+this.getName());
           sc.signal();
       }finally {
           lock.unlock();
       }
    }
}

class CustomerThread extends Thread{
    private Products p ;

    public CustomerThread(Products p) {
        this.p = p;
    }

    public void run() { //消费者
        for (int i = 1; i <= 10; i++) {
            try {
                p.xfz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ProduterThread extends Thread {
    private Products p;

    public ProduterThread(Products p) {
        this.p = p;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            if(i%2==0){
                p.setBrand("天蚕土豆");
                p.setName("大主宰");
            }else{
                p.setBrand("耳根");
                p.setName("仙逆");
            }
            p.scz();
        }
    }
}

class Mains {
    public static void main(String[] args) {
        Products p = new Products();
        ProduterThread pr= new ProduterThread(p);
        CustomerThread ct = new CustomerThread(p);
        pr.start();
        ct.start();
    }
}
