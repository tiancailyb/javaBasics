package cn.itcast.day09.demo03;

/**
 * @author lyb
 * @date 2020/2/28
 */
public class Parent {

    private static int nextid;

    private int id;

    public Parent() {
        this.id = nextid;
        nextid++;
    }

    public Parent(int id) {
        this.id = nextid;
        nextid++;
    }

    public static int getNextId() {
        return nextid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void methondA() {
        System.out.println("父类的methodA");
    }

    public void methodB() {
        System.out.println("父类的methodB");
    }
}
