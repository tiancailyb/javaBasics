package main.java.cn.itheima.demo05;

/**
 * @author lyb
 * @date 2020/3/5
 */
public class BaoZiPu extends Thread {

    private BaoZi bz;

    public BaoZiPu(BaoZi baoZi) {
        this.bz = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        synchronized (bz) {
            while (true) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (count % 2 == 0) {
                    bz.baoZiPi = "薄皮";
                    bz.xian = "白菜馅";
                    System.out.println("包子铺开始生产" + bz.baoZiPi + bz.xian + "的包子");
                } else {
                    bz.baoZiPi = "冰皮";
                    bz.xian = "粉丝豆芽馅";
                    System.out.println("包子铺开始生产" + bz.baoZiPi + bz.xian + "的包子");
                };
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("包子铺生产好了" + bz.baoZiPi + bz.xian + "的包子");
                count++;
                bz.flag = true;
                bz.notify();
            }
        }
    }
}
