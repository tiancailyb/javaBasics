/**
 * @author lyb
 * @date 2020/2/20
 */

public class HelloWorld {
    private static  int a = 10;
    private  static int b = 10;

    static {
        int a = 10;
        int b = 20;
    }


    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sum(1, 2);
        plus(2, 3);
    }

    /**
     * 计算两个数的和
     * @param a
     * @param b
     */
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void plus(int a, int b) {
        System.out.println(a + b);
    }
}
