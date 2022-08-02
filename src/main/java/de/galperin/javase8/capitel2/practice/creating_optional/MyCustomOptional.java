package de.galperin.javase8.capitel2.practice.creating_optional;

import java.util.Optional;

public class MyCustomOptional {
    public static void main(String[] args) {
        Optional<String> result =  myCustomOptional();
        result.ifPresent(val -> System.out.println(val));
    }

    private static Optional<String> myCustomOptional() {
        // return Optional.empty();
        // return Optional.of(null);  // can be null
        return Optional.ofNullable(getCategoryFromCatalogService());
    }

    private static String getCategoryFromCatalogService() {
        //return null;
        return "maar dala";
    }
}
