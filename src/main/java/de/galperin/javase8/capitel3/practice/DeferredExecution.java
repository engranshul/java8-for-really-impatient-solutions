package de.galperin.javase8.capitel3.practice;

import java.util.function.Supplier;

public class DeferredExecution {
    public static void main(String[] args) {
        String currentStatus = "login event received";
        // concatenation didnt happen here
        myLogger(() -> "for user id 123 "+currentStatus);
    }

    public static void myLogger(Supplier<String> supplier) {
        // it happened here
        System.out.println(supplier.get());
    }
}
