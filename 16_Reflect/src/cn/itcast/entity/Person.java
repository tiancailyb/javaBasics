package cn.itcast.entity;

/**
 * @author lyb
 * @date 2020/3/10
 */
public class Person {

    public int a;
    private String name;
    private int age;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("eat...");
    }

    public void eat(String food) {
        System.out.println("eat..." + food);
    }

    @Override
    public String toString() {
        return "Person{" +
                "a=" + a +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
