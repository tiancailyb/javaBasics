package cn.itcast.day08.demo02;

/**
 * @author lyb
 * @date 2020/2/27
 */
public class Demo01MathPractice {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;

        for (int i = (int)min; i < max ; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2) {
                System.out.println(i);
            }
        }
    }
}
