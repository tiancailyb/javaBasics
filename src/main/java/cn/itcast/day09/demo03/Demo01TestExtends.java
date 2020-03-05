package cn.itcast.day09.demo03;

/**
 * @author lyb
 * @date 2020/2/28
 */
public class Demo01TestExtends {
    public static void main(String[] args) {
        Child child = new Child();
        child.methodC();
        System.out.println("===================");
        child.methodB();
        System.out.println("==================");
        System.out.println(Parent.getNextId());
        Parent one = new Parent();
        Parent two = new Parent();
        Parent three = new Parent();
        System.out.println(one.getId());
        System.out.println(two.getId());
        System.out.println(three.getId());
        System.out.println(Parent.getNextId());
        System.out.printf("%3d", 1000);
    }
}
