package main.java.cn.itheima.demo04;

/**
 * @author lyb
 * @date 2020/3/4
 */
public class Runnable {
    public static void main(String[] args) {
        RunnableImple runnableImple = new RunnableImple();
        Thread thread = new Thread(runnableImple);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
