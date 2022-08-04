package de.galperin.javase8.capitel2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C2E13Practice {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("baby", "by", "lo", "kan", "she", "me");
        Map<Object, Long> result =stringList.parallelStream().filter(word -> word.length() <= 3)
                .collect(Collectors.groupingBy(ele -> ele.length(),Collectors.counting()));
        System.out.println(result);
    }
}
