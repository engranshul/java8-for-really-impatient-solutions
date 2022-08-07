package de.galperin.javase8.capitel6;

import de.galperin.javase8.Exercise;
import org.junit.Test;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.LongAccumulator;

public class C6E1 implements Exercise {

    @Test
    @Override
    public void perform() {
        // An object reference that may be updated atomically
        AtomicReference<String> longest = new AtomicReference<>();
        // LongAccumulator is also a very interesting class – which allows us to implement a
        // lock-free algorithm in a number of scenarios.
        LongAccumulator accumulator = new LongAccumulator(Math::max, 0);
        List<String> words = getWordsAsList();
        words.parallelStream().forEach(
                word -> longest.updateAndGet(
                        currentLargest -> {
                            String result = word.length() > accumulator.intValue() ? word : currentLargest;
                            accumulator.accumulate(word.length());
                            return result;
                        }));
        System.out.println(longest.get());
        System.out.println(accumulator.get());
    }
}

// Arrays.asList returns a fixed sized list