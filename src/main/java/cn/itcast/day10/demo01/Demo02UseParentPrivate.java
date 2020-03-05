package cn.itcast.day10.demo01;

import cn.itcast.day10.demo01.otherPackage.Child;

/**
 * @author lyb
 * @date 2020/3/2
 */
public class Demo02UseParentPrivate {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.name);
        child.getStr();
    }
}
