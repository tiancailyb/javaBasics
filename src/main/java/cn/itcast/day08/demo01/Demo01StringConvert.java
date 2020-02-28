package cn.itcast.day08.demo01;

/**
 * @author lyb
 * @date 2020/2/26
 */
public class Demo01StringConvert {
    public static void main(String[] args) {
        String str1 = "Hello, world";
        char[] array = str1.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("=======================");
        byte[] bytes = str1.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        System.out.println("=========================");
        String str2 = str1.replace("o", "0");
        System.out.println(str2);
    }
}
