package cn.itheima.demo01.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author lyb
 * @date 2020/3/9
 */
public class Demo01Stream {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        Collections.addAll(listA, "张三丰", "赵敏","周芷若","张庆","张无忌");

        listA.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));

    }
}
