package cn.itcast.test;

import cn.itcast.domain.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author lyb
 * @date 2020/3/10
 */
public class CalculatorTest {

     static Calculator calculator = null;

    @Before
    public void init() {

        calculator = new Calculator();
    }

    public void close() {
        System.out.println("end...");
    }

    @Test
    public void testAdd() {
        int result = calculator.add(1, 2);
        Assert.assertEquals(result, 3);
    }
}
