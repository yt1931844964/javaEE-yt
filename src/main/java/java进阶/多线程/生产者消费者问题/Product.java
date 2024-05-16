package java进阶.多线程.生产者消费者问题;

class Product {  //商品类
    private String brand;
    private String name;
    Boolean flag=false;

    Product(){}

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
        if(flag==false){
            wait();
        }
        System.out.println("我看了："+this.getBrand()+"---"+this.getName());
        flag=false;
        notify();
    }

    // 生产者向商品中添加内容的方法
    public synchronized void scz(){
        if(flag==true){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setName(name);
        flag=true;
        System.out.println(this.getBrand()+"写了："+"----"+this.getName());
        notify();
    }
}

class CustomerThread extends Thread{
    private Product p ;

    public CustomerThread(Product p) {
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
    private Product p;

    public ProduterThread(Product p) {
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

class Main {
    public static void main(String[] args) {
        Product p = new Product();
        ProduterThread pr= new ProduterThread(p);
        CustomerThread ct = new CustomerThread(p);
        pr.start();
        ct.start();
    }
}
