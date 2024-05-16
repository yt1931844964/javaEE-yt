package java进阶.lambda;

/**
 * @program: javaEE
 * @description: 场景
 * @author: Mr.姚廷
 * @create: 2024-05-16 17:44
 **/
public class Lambda {

    public static void main(String[] args) {
        /**常规
         * 1.定义一个函数式接口方法
         * 2.定义实现类
         * 3.调用实现类的方法
         */
        MathOperation addition = new Addition();
        addition.operation(1, 2);
        /**匿名内部类
         * 1.定义一个函数式接口方法
         * 2.定义实现类
         * 3.调用实现类的方法
         */
        new Addition(){
            @Override
            public void operation(int a, int b) {
                System.out.println(a + b);
            }

        }.operation(1, 2);
        /**
         * lambda
         * Lambda简化，省略参数类型，代码块只有一句，可以省略花括号
         */
        MathOperation var = (a,b) -> System.out.println(a + b);
        var.operation(1, 2);
        /**
         * 例子
         */
        new Thread(() ->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

    }
}

//1.定义一个函数式接口方法
interface MathOperation {
    void operation(int a, int b);
}

//2.定义实现类
class Addition implements MathOperation {
    @Override
    public void operation(int a, int b) {
        System.out.println(a + b);
    }
}

