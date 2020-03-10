package cn.core.five.method;

import java.io.File;

/**
 * @author lyb
 * @date 2020/3/6
 */
public class Demo02Field {
    public static void main(String[] args) {
        Class clazz = getField();
        System.out.println(clazz.getFields());
        System.out.println(clazz.getMethods());
        System.out.println(File.separator);
    }

    private static Class<Demo02Field> getField() {
        return Demo02Field.class;
    }
}
