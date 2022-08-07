package de.galperin.javase8.capitel6.practice;

import java.util.function.UnaryOperator;

public class UnaryOptr {
    public static void main(String[] args) {
        UnaryOperator<String> impl = new UnaryOperator<String>() {
            @Override
            public String apply(String string) {
                return null;
            }
        };
    }
}

// remember that one interface can extend another interface
// UnaryOperator interface extends Function interface