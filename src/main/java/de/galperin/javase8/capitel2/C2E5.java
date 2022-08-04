package de.galperin.javase8.capitel2;

import de.galperin.javase8.Exercise;
import org.junit.Test;
import java.util.stream.Stream;

public class C2E5 implements Exercise {

    @Test
    @Override
    public void perform() {
        randomStream(System.currentTimeMillis(), 25214903917l, 11, (long) Math.pow(2, 48))
                .limit(10)
                .forEach(System.out::println);
    }

    public Stream<Long> randomStream(long seed, long a, long c, long m){
        // using Stream.iterate to make an infinite stream of random nos
        return Stream.iterate(seed, e -> (a * e + c) % m);
    }
}
