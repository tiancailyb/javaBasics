package main.java.cn.itheima.demo03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author lyb
 * @date 2020/3/2
 */
public class Demo01HashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
