package main.java.cn.itheima.demo03;

/**
 * @author lyb
 * @date 2020/3/4
 */
public class MyThreadSleep extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
