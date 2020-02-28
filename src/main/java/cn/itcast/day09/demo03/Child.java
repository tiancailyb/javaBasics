package cn.itcast.day09.demo03;

/**
 * @author lyb
 * @date 2020/2/28
 */
public class Child extends Parent {

    public void methodC() {
        super.methodB();
        System.out.println("子类的methodC");
    }

    @Override
    public void methodB() {
        super.methodB();
        System.out.println("子类的methodB");
    }
}
