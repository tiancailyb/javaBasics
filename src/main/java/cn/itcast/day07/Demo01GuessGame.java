package cn.itcast.day07;

import java.util.Random;
import java.util.Scanner;

/**
 * @author lyb
 * @date 2020/2/26
 */
public class Demo01GuessGame {
    public static void main(String[] args) {

        int num = new Random().nextInt(100) + 1;
        int guess;
        Scanner scanner = new Scanner(System.in);
        boolean isRight = false;
        for (int i = 0; i < 10; i++) {
            System.out.print("请输入一个数字：");
            guess = scanner.nextInt();
            if (guess > num) {
                System.out.println("数据太大了，请重新输入!");
            } else if (guess < num) {
                System.out.println("数据太小了，请重新输入!");
            } else {
                System.out.println("恭喜你，猜对了！！");
                isRight = true;
                break;
            }
        }
        if (isRight == false) {
            System.out.println("10次都没才对，你太笨了！！！");
        }
    }
}
