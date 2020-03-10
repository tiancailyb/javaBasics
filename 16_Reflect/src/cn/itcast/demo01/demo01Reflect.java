package cn.itcast.demo01;

import cn.itcast.entity.Person;

/**
 * @author lyb
 * @date 2020/3/10
 * @version 1.0
 * @since 2020
 */
public class demo01Reflect {
    public static void main(String[] args) throws Exception {
        Class p1 = Person.class;
        Class p2 = Class.forName("cn.itcast.entity.Person");
        Class p3 = new Person().getClass();

        System.out.println(p1 == p2);
        System.out.println(p2 == p3);

    }
}
