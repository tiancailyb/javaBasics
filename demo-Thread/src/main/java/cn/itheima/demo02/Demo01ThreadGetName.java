package main.java.cn.itheima.demo02;

/**
 * @author lyb
 * @date 2020/3/4
 */
public class Demo01ThreadGetName {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //myThread.start();
        myThread.start();
        String name = Thread.currentThread().getName();
        System.out.println("main-->" + name);

    }
}
