package main.java.cn.itheima.demo01;

import java.util.*;

/**
 * @author lyb
 * @date 2020/3/3
 */
public class Demo01StringCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        char[] list = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(char c: list) {
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value += 1;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        };

        testList();
    }

    public static void testList() {
        List<String> list= new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d");
        System.out.println(list);
    }

}
