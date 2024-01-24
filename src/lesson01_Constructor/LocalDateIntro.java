package lesson01_Constructor;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1990, 5, 31);

        System.out.println(today);
        System.out.println(birthday);

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());

        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println(birthday.getDayOfWeek());
        System.out.println(birthday.getDayOfMonth());
        System.out.println(birthday.getDayOfYear());

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println(today.plusYears(1));
        System.out.println(today.minusYears(1));

        System.out.println("--------------------------------------------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025, 6, 4);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusYears(2); // 2027-6-4

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("-------------------------------------------------------------------------");

        LocalDate myBrothersBirthday = birthday.minusYears(7).minusDays(21);

        System.out.println(myBrothersBirthday);

        System.out.println("---------------------------------------------------------------------------");

        LocalDate bd1 = LocalDate.of(1994,7,7);
        LocalDate bd2 = LocalDate.of(1994,7,7);

        boolean r1 = bd1.isEqual(bd2);

        System.out.println(r1);

        System.out.println("--------------------------------------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023,1,1);

        boolean r2 = grad_date.isBefore(LocalDate.of(2022,12,31));
        boolean r3 = grad_date.isAfter(LocalDate.of(2022,12,31));

        System.out.println(r2);
        System.out.println(r3);

        System.out.println("-------------------------------------------------------------------------------");

        boolean r4 = LocalDate.of(2022,2,15).isLeapYear();

        System.out.println(r4);
    }
}
