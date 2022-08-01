package de.galperin.javase8.capitel1.practice.method_ref;

import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        // printing example
        List<String> stringList = Arrays.asList("anshul","aaa");
        stringList.forEach(System.out::println);
    }
}
