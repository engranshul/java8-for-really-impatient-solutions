package de.galperin.javase8.capitel2.practice.primitive_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("wow","meow","dao");

        //IntStream result = stringList.stream().mapToInt(element -> element.length());
        DoubleStream result = stringList.stream().mapToDouble(element -> element.length());
        result.forEach(x -> System.out.println(x));
    }
}

// so far we have collected integers in Stream<Integer>, even though it is clearly
// inefficient to wrap each integer into a wrapper object


