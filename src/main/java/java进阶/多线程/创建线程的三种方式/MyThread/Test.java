package java进阶.多线程.创建线程的三种方式.MyThread;

public class Test {
    public static void main(String[] args) {
        Thread.currentThread().setName("这是主线程");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        MyThread t1= new MyThread("次线程");
        t1.start();

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }


    }

}
class MyThread extends Thread{
    public MyThread(String name){   //给线程命名
        super.setName(name);
        //this.setName();

    }

    public MyThread() {
    }

    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(this.getName()+"执行"+i+"次"+"\t"+"总共"+"\t"+(10-i));
        }
    }
}
