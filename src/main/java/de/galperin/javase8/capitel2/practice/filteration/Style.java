package de.galperin.javase8.capitel2.practice.filteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Style {
    public static void main(String[] args) {

        System.out.println("***traditional style**");
        String[] words = {"anshul","hunny","shalu"};
        List<String> results = new ArrayList<>();
        for (int i=0;i<words.length;i++) {
            if(words[i].length() >5) {
                results.add(words[i]);
            }
        }
        System.out.println(results);

        System.out.println("****new style*****");
        Arrays.asList(words).stream().filter(x -> x.length() > 5).forEach(y -> System.out.println(y));
    }
}

// see the no of lines difference between traditional n new style