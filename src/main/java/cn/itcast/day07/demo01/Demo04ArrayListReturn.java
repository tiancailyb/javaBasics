package cn.itcast.day07.demo01;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lyb
 * @date 2020/2/26
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(100) + 1;
            bigList.add(num);
        }
        System.out.println(bigList);

        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        System.out.println("偶数一共有： " + smallList.size());
        System.out.println(smallList);
    }
}
