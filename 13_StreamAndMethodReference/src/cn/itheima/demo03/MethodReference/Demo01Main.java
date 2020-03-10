package cn.itheima.demo03.MethodReference;

/**
 * @author lyb
 * @date 2020/3/9
 */
public class Demo01Main {

    public static void print(PrintlnInterface printlnInterface) {
        printlnInterface.printlen("Hello, world");
    }

    public static void main(String[] args) {

        print(s-> {
            System.out.println(s);
        });

        print(System.out::println);
    }
}
