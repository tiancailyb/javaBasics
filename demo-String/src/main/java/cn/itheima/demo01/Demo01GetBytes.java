package main.java.cn.itheima.demo01;

import java.util.Arrays;

/**
 * @author lyb
 * @date 2020/3/5
 */
public class Demo01GetBytes {
    public static void main(String[] args) {
        String str = "abc";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println(Arrays.toString(chars));

        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println(Arrays.toString(bytes));
    }
}
