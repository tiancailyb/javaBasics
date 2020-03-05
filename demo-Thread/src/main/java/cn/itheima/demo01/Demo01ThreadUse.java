package main.java.cn.itheima.demo01;

/**
 * @author lyb
 * @date 2020/3/4
 */
public class Demo01ThreadUse {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main--->" + i);
        }
    }
}
