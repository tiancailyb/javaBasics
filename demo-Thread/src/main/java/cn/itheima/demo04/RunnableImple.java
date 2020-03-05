package main.java.cn.itheima.demo04;

/**
 * @author lyb
 * @date 2020/3/4
 */
public class RunnableImple implements java.lang.Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
