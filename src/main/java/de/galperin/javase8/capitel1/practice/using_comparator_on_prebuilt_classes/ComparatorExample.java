package de.galperin.javase8.capitel1.practice.using_comparator_on_prebuilt_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("anshul","hunny","ram");
        // see below sort requires object of comparator
        // stringList.sort(new StrComparasion());

        // shortcut using anonymous class
        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
        System.out.println(stringList);

        // shortcut using lambda
        stringList.sort(((o1, o2) -> Integer.compare(o1.length(),o2.length() )));

        // shortcut using Comparator.comparingInt()
        // see how comparingInt internally calls Integer.compare only
        //stringList.sort((Comparator.comparingInt()));
    }
}

// compare method will not get executed right away..it will get executed
// only after we call .sort() on stringList
class StrComparasion implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(),o2.length());
    }
}