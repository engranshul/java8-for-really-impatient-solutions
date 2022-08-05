package de.galperin.javase8.capitel5;

import de.galperin.javase8.Exercise;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;


public class C5E3 implements Exercise {

    @Test
    @Override
    public void perform() {
        LocalDate date = LocalDate.of(2014, Month.NOVEMBER, 22);
        LocalDate nextWorkday = date.with(next(w -> w.getDayOfWeek().getValue() < 6));
        assertEquals(24, nextWorkday.getDayOfMonth());
        assertEquals(Month.NOVEMBER, nextWorkday.getMonth());
    }

    public TemporalAdjuster next(Predicate<LocalDate> predicate) {
        return TemporalAdjusters.ofDateAdjuster(temporal -> {
            LocalDate date = temporal;
            do {
                date = date.plusDays(1);
            } while (!predicate.test(date)); // loop
            return date;
        });
    }
}

// Adjusters are a key tool for modifying temporal objects. They exist to externalize
// the process of adjustment, permitting different approaches, as per the strategy
// design pattern. Examples might be an adjuster that sets the date avoiding
// weekends, or one that sets the date to the last day of the month.