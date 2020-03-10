package cn.itcast.demo01;

import cn.itcast.entity.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author lyb
 * @date 2020/3/10
 */
public class demo02ReflectMethod {

    public static void main(String[] args) throws Exception {
        Class p1 = Person.class;
        //System.out.println(p.getName());
        /*Method[] methods = p.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        /*Field[] fields = p.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/

        /*Field[] declaredFields = p.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }*/
        Person p = new Person();
        /*Field name = p1.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p, "张三");
        System.out.println(p);*/
        /*Constructor constructor = p1.getConstructor();
        Object o = constructor.newInstance();
        System.out.println(o);

        Object o1 = p1.newInstance();
        System.out.println(o1);*/

        Method eat = p1.getMethod("eat");
        eat.invoke(p);

        Method eat1 = p1.getMethod("eat", String.class);
        eat1.invoke(p, "food");
    }
}
