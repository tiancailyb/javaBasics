package main.java.cn.itheima.demo05;

/**
 * @author lyb
 * @date 2020/3/5
 */
public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        synchronized (bz) {
            while (true) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("吃货开始吃" + bz.baoZiPi + bz.xian + "的包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
