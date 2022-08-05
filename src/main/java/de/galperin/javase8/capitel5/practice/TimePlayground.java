package de.galperin.javase8.capitel5.practice;

import java.time.*;

public class TimePlayground {
    public static void main(String[] args) {
        //generalPractice();
        localDatePractice();
    }

    private static void localDatePractice() {
        // try adding one year and 4 years to below line..
        LocalDate localDate = LocalDate.of(2000,2,29).plusYears(1);
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(2000,2,29).plusYears(1).plusYears(1);
        System.out.println(localDate1);
    }

    private static void generalPractice() {
        LocalDate date = LocalDate.now();
        System.out.println("localdate : "+date);

        LocalTime time = LocalTime.now();
        System.out.println("localtime : "+time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("localdatetime : "+dateTime);

        Instant start = Instant.now();
        System.out.println("instant : "+start);

        Instant end = Instant.now();
        System.out.println("instant : "+end);

        Duration duration = Duration.between(start,end);
        System.out.println("duration : "+duration.toNanos());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zoneddatetime : "+zonedDateTime);
    }
}
