package java进阶.AWT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGameWindow extends JFrame implements KeyListener {
    private int x, y;
    public MyGameWindow() {
        // 设置窗口标题和大小
        setTitle("My Game Window");
        setSize(400, 400);

        // 监听键盘事件
        addKeyListener(this);

        // 窗口居中显示
        setLocationRelativeTo(null);

        // 设置退出窗口时程序结束
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 显示窗口
        setVisible(true);
    }

    // 绘制方法
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }

    // 监听键盘按下事件
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 5;
            repaint();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 5;
            repaint();
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y -= 5;
            repaint();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y += 5;
            repaint();
        }
    }

    // 监听键盘释放事件
    @Override
    public void keyReleased(KeyEvent e) {}

    // 监听键入事件
    @Override
    public void keyTyped(KeyEvent e) {}
}
