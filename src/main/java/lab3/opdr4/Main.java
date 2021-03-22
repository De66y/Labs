package lab3.opdr4;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //LocalDateTime date = LocalDateTime.of(2021, 03, 22, 23, 00);
        //System.out.println(date.plusHours(80));

        System.out.printf("We zijn %d dagen later en het nummer van het uur is %d", daysFurther(23, 80), hoursFurther(23, 80));
    }

    public static int daysFurther(int timeNow, int hoursLater) {
        return ((hoursLater - (24 - timeNow)) / 24) + 1;
    }

    public static int hoursFurther(int timeNow, int hoursLater) {
        return (hoursLater - (24 - timeNow)) % 24;
    }
}
