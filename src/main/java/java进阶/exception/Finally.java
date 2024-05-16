package java进阶.exception;
          /*
          1，什么情况下，try-catch后面的代码不执行
             a：throw抛出异常的情况
             b：catch中没有正常的进行异常捕获
             c：try中遇到return；
          2，什么情况下，try-catch后面的代码必须执行？
             只要将执行的代码放入finally中，这个代码就一定会执行（有一种情况除外）
          3，return和finally执行顺序
             先执行finally然后执行return
          4，什么代码会被放在finally中
             关闭数据库资源，关闭io流资源，关闭socket资源
          5，有一个情况会导致finally不执行？
              System.exit(0); //终止当前虚拟机运行
           */

public class Finally {
    public static void main(String[] args) {
        try{
            System.out.println(4/0);
            //return;
        }catch(Exception ex){
            throw ex;
        }finally{

            System.out.println("除了 System.exit(0)，没有人能影响我");
        }

        System.out.println("完了被throw和return影响了");


    }
}
