package cn.core.five.method;

/**
 * @author lyb
 * @date 2020/3/6
 */
public class Demo01Class {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Demo01Class.class;
        System.out.println(clazz.getName());

        Class<?> aClass = Class.forName("cn.core.five.method.Demo01Class");
        System.out.println(aClass.getName());
    }
}
