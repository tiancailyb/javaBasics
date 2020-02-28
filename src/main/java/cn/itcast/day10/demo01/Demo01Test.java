package cn.itcast.day10.demo01;

/**
 * @author lyb
 * @date 2020/2/28
 */
public class Demo01Test {

    public static void main(String[] args) {
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.defaultMethod();
        myInterface.methodA();
        MyInterface.staticMethod();
        System.out.println(MyInterface.a);
    }
}
