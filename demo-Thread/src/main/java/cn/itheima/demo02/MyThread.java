package main.java.cn.itheima.demo02;

/**
 * @author lyb
 * @date 2020/3/4
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        /*String name = getName();
        System.out.println(name);*/
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        System.out.println(thread.getName());

    }
}
