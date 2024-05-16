package java进阶.测试;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Before //表示前注解（程序开始时运行）
    public void start(){
        System.out.println("开始测试");
    }
    @After//表示后注解（程序结束时运行）    一般用来IO流，数据库，网络的开始或关闭操作
    public void end(){
        System.out.println("结束测试");
    }
    @Test
    public void addTest(){
        Calculator cal = new Calculator();
        int result = cal.add(10,20);
        Assert.assertEquals(30,result);

    }
    @Test
    public void subTest(){
        Calculator cal = new Calculator();
        int result = cal.sub(10,20);
        //加入断言：预测结果与实际结果比较
        Assert.assertEquals(-10,result);
    }
}
