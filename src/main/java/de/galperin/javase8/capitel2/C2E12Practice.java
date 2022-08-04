package de.galperin.javase8.capitel2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// count freq without using filter
public class C2E12Practice {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("baby", "shabby", "lo", "kan", "she", "me");
        AtomicInteger[] countArr = new AtomicInteger[stringList.size()];
        stringList.parallelStream().forEach(ele -> {
            int len = ele.length();
            if (len <= 3) {
                AtomicInteger atomicIntger = countArr[len];
                if (atomicIntger == null) {
                    countArr[len] = new AtomicInteger(1);
                } else {
                    countArr[len].incrementAndGet();
                }
            }

        });
        System.out.println(Arrays.toString(countArr));
    }
}
