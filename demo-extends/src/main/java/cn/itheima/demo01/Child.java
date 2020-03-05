package main.java.cn.itheima.demo01;

/**
 * @author lyb
 * @date 2020/3/5
 */
public class Child extends Parent {

    private double bonus;

    @Override
    public double getSalary() {
        double base = super.getSalary();
        double salary = base + this.bonus;
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
