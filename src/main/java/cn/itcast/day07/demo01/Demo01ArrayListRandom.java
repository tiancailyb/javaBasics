package cn.itcast.day07.demo01;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lyb
 * @date 2020/2/26
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int num;
        for (int i = 0; i < 6; i++) {
            num = random.nextInt(32) + 1;
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
