package main.java.cn.itheima.demo06;

/**
 * @author lyb
 * @date 2020/3/5
 */
public class RunnalableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
