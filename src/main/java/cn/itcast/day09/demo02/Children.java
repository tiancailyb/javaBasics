package cn.itcast.day09.demo02;

/**
 * @author lyb
 * @date 2020/2/27
 */
public class Children extends Parent {

    public Children() {
        super(30);
        System.out.println("hahah");
    }

    public Children(int num) {
        super(10);
        System.out.println(num);
    }
}
