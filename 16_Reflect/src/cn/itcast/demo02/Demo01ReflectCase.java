package cn.itcast.demo02;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author lyb
 * @date 2020/3/10
 */
public class Demo01ReflectCase {

    public static void main(String[] args) throws Exception {

        Properties pro = new Properties();
        ClassLoader classLoader = Demo01ReflectCase.class.getClassLoader();

        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        pro.load(resourceAsStream);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);
    }
}
