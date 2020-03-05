package main.java.cn.itheima.demo04;

/**
 * @author lyb
 * @date 2020/3/2
 */
public class Demo01HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);
        Person p2 = new Person();
        System.out.println(p2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println("================");
        String s1 = new String("重地");
        String s2 = new String("通话");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
