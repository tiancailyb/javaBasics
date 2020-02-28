package cn.core.four;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author lyb
 * @date 2020/2/26
 */
public class Demo01LocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("===============");
        localDate = LocalDate.of(2020, 2, 26);
        System.out.println(localDate);
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(dayOfMonth);
        LocalDate localDate1 = LocalDate.now();
        System.out.println("==============================");
        System.out.println(localDate1);
        int dayOfMonth1 = localDate1.getDayOfMonth();
        System.out.println(dayOfMonth1);
        System.out.println(dayOfMonth1 - 1);
        LocalDate localDate2 = localDate1.minusDays(localDate1.getDayOfMonth() - 1);
        System.out.println(localDate2);
    }
}
