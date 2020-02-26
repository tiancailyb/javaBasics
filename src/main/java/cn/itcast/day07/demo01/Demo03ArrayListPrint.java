package cn.itcast.day07.demo01;

import java.util.ArrayList;

/**
 * @author lyb
 * @date 2020/2/26
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张");
        list.add("李");
        list.add("孙");
        list.add("赵");
        System.out.println(list);
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
        System.out.print("}");
    }
}
