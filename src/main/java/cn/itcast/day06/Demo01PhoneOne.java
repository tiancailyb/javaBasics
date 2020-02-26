package cn.itcast.day06;

/**
 * @author lyb
 * @date 2020/2/25
 */
public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("=============");
        one.brand = "苹果";
        one.price = 8848.2;
        one.color = "红色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("==============");
        one.call("小明");
        one.sendMesage();
    }
}
