package lesson01_constructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Homework {

    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.of(2020,11,24,13,0);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        System.out.println(time.format(dtf));
    }
}
/*
1. use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
 */