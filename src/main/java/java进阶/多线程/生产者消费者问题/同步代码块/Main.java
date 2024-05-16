package java进阶.多线程.生产者消费者问题.同步代码块;

import java.util.ArrayList;
import java.util.List;

// 定义一个产品类 Product，有两个属性：品牌和名称
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
    private final Object lock;
    private final List<Product> productList;
    private int count;

    public Producer(Object lock, List<Product> productList) {
        this.lock = lock;
        this.productList = productList;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                // 如果产品库存已满，则等待
                while (productList.size() >= 10) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 生产产品
                Product product = new Product("品牌" + (++count / 10 + 1), "产品" + (count % 10 + 1));
                System.out.println("生产者生产了新产品：" + product.getBrand() + " - " + product.getName());
                productList.add(product);
                // 唤醒其他线程
                lock.notifyAll();
            }
        }
    }
}

// 定义消费者类 Consumer
class Consumer implements Runnable {
    private final Object lock;
    private final List<Product> productList;

    public Consumer(Object lock, List<Product> productList) {
        this.lock = lock;
        this.productList = productList;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                // 如果产品库存为空，则等待
                while (productList.isEmpty()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 消费产品
                Product product = productList.remove(0);
                System.out.println("消费者消费了新产品：" + product.getBrand() + " - " + product.getName());
                // 唤醒其他线程
                lock.notifyAll();
            }
        }
    }
}

// main函数
public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Object lock = new Object();
        Producer producer = new Producer(lock, productList);
        Consumer consumer = new Consumer(lock, productList);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
