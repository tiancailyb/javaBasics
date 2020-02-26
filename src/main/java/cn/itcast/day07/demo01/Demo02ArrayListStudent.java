package cn.itcast.day07.demo01;

import java.util.ArrayList;

/**
 * @author lyb
 * @date 2020/2/26
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("欧阳锋", 20);
        Student two = new Student("洪七公", 21);
        Student three = new Student("黄老邪", 22);
        Student four = new Student("段王爷", 23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + ", 年龄：" + stu.getAge());
        }
    }
}
