package cn.itcast.day08.demo01;

/**
 * @author lyb
 * @date 2020/2/26
 */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("-----------------------");
        String str3 = "Hello";
        String str4 = str3.concat("World");
        System.out.println(str4);
        System.out.println(str4.length());
    }
}
