package java进阶.多线程.生产者消费者问题.Lock锁;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Product {
    private String brand;
    private String name;

    public Product(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }
}



// 定义生产者类 Producer
class Producer implements Runnable {
    private final Lock lock;
    private final Condition notFull;
    private final Condition notEmpty;
    private final List<Product> productList;
    private int count;

    public Producer(Lock lock, Condition notFull, Condition notEmpty, List<Product> productList) {
        this.lock = lock;
        this.notFull = notFull;
        this.notEmpty = notEmpty;
        this.productList = productList;
    }

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                // 如果产品库存已满，则等待
                while (productList.size() >= 10) {
                    notFull.await();
                }
                // 生产产品
                Product product = new Product("品牌" + (++count / 10 + 1), "产品" + (count % 10 + 1));
                System.out.println("生产者生产了新产品：" + product.getBrand() + " - " + product.getName());
                productList.add(product);
                // 唤醒其他线程
                notEmpty.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}

// 定义消费者类 Consumer
class Consumer implements Runnable {
    private final Lock lock;
    private final Condition notFull;
    private final Condition notEmpty;
    private final List<Product> productList;

    public Consumer(Lock lock, Condition notFull, Condition notEmpty, List<Product> productList) {
        this.lock = lock;
        this.notFull = notFull;
        this.notEmpty = notEmpty;
        this.productList = productList;
    }

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                // 如果产品库存为空，则等待
                while (productList.isEmpty()) {
                    notEmpty.await();
                }
                // 消费产品
                Product product = productList.remove(0);
                System.out.println("消费者消费了新产品：" + product.getBrand() + " - " + product.getName());
                // 唤醒其他线程
                notFull.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}

// main函数
public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Lock lock = new ReentrantLock();
        Condition notFull = lock.newCondition();
        Condition notEmpty = lock.newCondition();
        Producer producer = new Producer(lock, notFull, notEmpty, productList);
        Consumer consumer = new Consumer(lock, notFull, notEmpty, productList);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
