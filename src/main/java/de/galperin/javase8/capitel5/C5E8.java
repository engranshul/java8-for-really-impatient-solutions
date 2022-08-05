package de.galperin.javase8.capitel5;

import de.galperin.javase8.Exercise;
import org.junit.Test;

import java.time.Instant;
import java.time.ZoneId;

public class C5E8 implements Exercise {

    @Test
    @Override
    public void perform() {
        Instant now = Instant.now();
        // turning into stream concept
        ZoneId.getAvailableZoneIds().stream()
                .map(id -> now.atZone(ZoneId.of(id)).getOffset())
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
