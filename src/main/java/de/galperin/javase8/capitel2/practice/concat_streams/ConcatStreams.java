package de.galperin.javase8.capitel2.practice.concat_streams;


import java.util.stream.Stream;

public class ConcatStreams {
    public static void main(String[] args) {
        // concept that how in below code neither Stream Of Integer or Stream of Double
        // will work
        Stream<Object> result=  Stream.concat(Stream.concat(Stream.of(1,2,3),Stream.of(1.1)),Stream.of("anshu","hunny"));
        result.forEach(x -> System.out.println(x));
    }
}
