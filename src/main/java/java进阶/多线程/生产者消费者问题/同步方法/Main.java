package java进阶.多线程.生产者消费者问题.同步方法;

import java.util.ArrayList;
import java.util.List;

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
    private final List<Product> productList;

    public Producer(List<Product> productList) {
        this.productList = productList;
    }

    // 生产产品的方法
    public synchronized void produce() {
        // 如果产品库存已满，则等待
        while (productList.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 生产产品
        Product product = new Product("品牌" + (productList.size() / 10 + 1), "产品" + (productList.size() % 10 + 1));
        System.out.println("生产者生产了新产品：" + product.getBrand() + " - " + product.getName());
        productList.add(product);
        // 唤醒其他线程
        notifyAll();
    }

    @Override
    public void run() {
        while (true) {
            produce();
        }
    }
}

// 定义消费者类 Consumer
class Consumer implements Runnable {
    private final List<Product> productList;

    public Consumer(List<Product> productList) {
        this.productList = productList;
    }

    // 消费产品的方法
    public synchronized void consume() {
        // 如果产品库存为空，则等待
        while (productList.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 消费产品
        Product product = productList.remove(0);
        System.out.println("消费者消费了新产品：" + product.getBrand() + " - " + product.getName());
        // 唤醒其他线程
        notifyAll();
    }

    @Override
    public void run() {
        while (true) {
            consume();
        }
    }
}

// main函数
public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Producer producer = new Producer(productList);
        Consumer consumer = new Consumer(productList);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
