package de.galperin.javase8.capitel5;

import de.galperin.javase8.Exercise;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;


public class C5E6 implements Exercise {

    @Test
    @Override
    public void perform() {
        LocalDate date = LocalDate.of(1900, 1, 1).with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        LocalDate millennium = LocalDate.of(2000, 1, 1);
        // isBefore usage and amazing use of while loop
        while (date.isBefore(millennium)) {
            if(date.getDayOfMonth() == 13) {
                System.out.println(date.format(DateTimeFormatter.ofPattern("E dd MM yyyy")));
            }
            date = date.plusWeeks(1);
        }
    }
}
