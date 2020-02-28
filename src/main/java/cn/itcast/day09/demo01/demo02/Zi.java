package cn.itcast.day09.demo01.demo02;

import cn.itcast.day09.demo01.demo02.Fu;

/**
 * @author lyb
 * @date 2020/2/27
 */
public class Zi extends Fu {
    int num = 100;

    public void method() {
        int num = 1000;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
