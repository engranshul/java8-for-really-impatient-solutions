package de.galperin.javase8.capitel2.practice.stream_creation;

import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        Stream<Double> result =Stream.generate(() -> Math.random());
        result.forEach(y -> System.out.println(y));
    }
}

// see how to process this stream data..systems like kafka,apache spark
// are build for this :)