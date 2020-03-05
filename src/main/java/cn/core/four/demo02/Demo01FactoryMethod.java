package cn.core.four.demo02;

import java.text.NumberFormat;

/**
 * @author lyb
 * @date 2020/2/28
 */
public class Demo01FactoryMethod {
    public static void main(String[] args) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyInstance.format(x));
        System.out.println(percentInstance.format(x));
    }
}
