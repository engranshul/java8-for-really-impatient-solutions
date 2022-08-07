package de.galperin.javase8.capitel6.practice;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc","abcde","xyz","mn");
        stringList.forEach(word -> System.out.println(word));
    }
}
// Consumer interface take a param n returns void..