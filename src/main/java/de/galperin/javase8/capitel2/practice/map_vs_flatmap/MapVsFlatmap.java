package de.galperin.javase8.capitel2.practice.map_vs_flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatmap {

    public static void main(String[] args) {

        // transform a stream of strings into another stream containing only long words
        List<String> list = new ArrayList<>();
        list.add("anshul");
        list.add("hunny");
        list.add("sunny");
        Stream<String> str = list.stream();
        Stream<String> str1 = list.stream();
        Stream<String> str2 = list.stream();

        System.out.println("**get first characters..here map function is returning one value for every call**");
        Stream<Character> firstChars = str.map(x -> x.charAt(0));
        System.out.println(Arrays.toString(firstChars.toArray()));

        System.out.println("****wat if map function returns a stream every time it is called****");
        Stream<Stream<Integer>> streamOfStream = str1.map(z -> Stream.of(1,2,3,4));
        List<Stream<Integer>> listOfStream = streamOfStream.collect(Collectors.toList());
        listOfStream.forEach( strem -> System.out.println(strem.collect(Collectors.toList())));

        System.out.println("convert above map to flatmap");
        Stream<Integer> streamOfInteger = str2.flatMap(z -> Stream.of(1,2,3,4));
        System.out.println(streamOfInteger.collect(Collectors.toList()));
    }
}
