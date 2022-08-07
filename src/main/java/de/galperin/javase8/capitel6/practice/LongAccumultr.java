package de.galperin.javase8.capitel6.practice;

import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumultr {
    public static void main(String[] args) {
        // LongAccumulator accumulator = new LongAccumulator(Math::min,50L);
        //LongAccumulator accumulator = new LongAccumulator(Math::max,50L);
        LongAccumulator accumulator = new LongAccumulator((x, y) -> x + y, 50L);
        accumulator.accumulate(10);
        accumulator.accumulate(1000);
        System.out.println(accumulator.get());
    }
}
