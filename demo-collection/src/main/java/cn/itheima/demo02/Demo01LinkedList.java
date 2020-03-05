package main.java.cn.itheima.demo02;

import java.util.LinkedList;

/**
 * @author lyb
 * @date 2020/3/2
 */
public class Demo01LinkedList {
    public static void main(String[] args) {
        show03();
    }

    private static void show03() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //String first = list.removeFirst();
        String first = list.pop();
        System.out.println(first);
        String last = list.removeLast();
        System.out.println(last);
    }

    private static void show02() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String first = list.getFirst();
        System.out.println(first);
        String last = list.getLast();
        System.out.println(last);

    }

    private static void show01() {
        LinkedList<String> list = new LinkedList<>();
        //list.addFirst("www");
        list.push("www");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.addLast(".com");
        System.out.println(list);
    }
}
