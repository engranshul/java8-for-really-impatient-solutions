package de.galperin.javase8.capitel2;

import java.util.Arrays;
import java.util.List;

public class C2E2Practice {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("jan", "gan", "man","sun","man","lala","data");
        words.stream().filter(element -> {
            System.out.println("filtering stuff..");
            return element.length() == 3;
        }).limit(2).forEach(System.out::println);
    }
}
