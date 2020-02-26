package cn.itcast.day06;

/**
 * @author lyb
 * @date 2020/2/25
 */
public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who) {
        System.out.println("打电话给：" + who);
    }

    public void sendMesage() {
        System.out.println("群发短信");
    }
}
