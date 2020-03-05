package main.java.cn.itheima.demo01;

/**
 * @author lyb
 * @date 2020/3/5
 */
public class Parent {
    private String name;
    private double salary;

    public Parent(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Parent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
