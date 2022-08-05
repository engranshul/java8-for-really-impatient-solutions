package de.galperin.javase8.capitel2;

import de.galperin.javase8.Exercise;
import org.junit.Test;
import java.util.Arrays;
import java.util.stream.IntStream;

public class C2E4 implements Exercise {

    @Test
    @Override
    public void perform() {
        int[] values = {1, 4, 9, 16};
        // Just like Collection has Collections, Array has Arrays
        IntStream streamOfInts = Arrays.stream(values);
        // Stream<int[]> intArrStream = Stream.of(values);   // allowed coz arrays are considered object  in java
        // Stream<int> intStream = Stream.of(1);                    // not allowed : type argument can not be primitive type
        streamOfInts.forEach(System.out::println);
    }
}
