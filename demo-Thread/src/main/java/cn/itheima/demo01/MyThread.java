package main.java.cn.itheima.demo01;

/**
 * @author lyb
 * @date 2020/3/4
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("MyThread-->" + i);
        }
    }
}
