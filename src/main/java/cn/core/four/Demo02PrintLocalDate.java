package cn.core.four;


import java.time.LocalDate;

/**
 * @author lyb
 * @date 2020/2/26
 */
public class Demo02PrintLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        int month = date.getMonthValue();
        LocalDate firstDayOfMonth = date.minusDays(today - 1);
        int week = firstDayOfMonth.getDayOfWeek().getValue();

        System.out.println("Mon Tue Wed Thr Fri Sat Sun");
        for (int i = 0; i < week; i++) {
            System.out.print("   ");
        }
        System.out.print("  ");
        while (firstDayOfMonth.getMonthValue() == month) {
            System.out.printf("%3d", firstDayOfMonth.getDayOfMonth());
            if (firstDayOfMonth.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (firstDayOfMonth.getDayOfWeek().getValue() == 7) {
                System.out.println();
            }
            firstDayOfMonth = firstDayOfMonth.plusDays(1);
        }
        

    }
}
