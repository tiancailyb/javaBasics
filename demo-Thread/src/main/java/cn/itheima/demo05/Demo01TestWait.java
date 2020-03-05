package main.java.cn.itheima.demo05;

/**
 * @author lyb
 * @date 2020/3/5
 */
public class Demo01TestWait {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
