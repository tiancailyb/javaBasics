package cn.itcast.day10.demo01;

/**
 * @author lyb
 * @date 2020/2/28
 */
public interface MyInterface {

    public static final int a = 10;

    public abstract void methodA();

    public default void defaultMethod() {
        System.out.println("interface的default方法");
    }

     static void staticMethod() {
        System.out.println("私有的静态方法");
    }
}
