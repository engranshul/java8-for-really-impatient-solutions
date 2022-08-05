package de.galperin.javase8.capitel3.practice;

import java.util.function.Consumer;

public class HandlingExceptions {
    public static void main(String[] args) {
        System.out.println("**case 1: first throws exception and second never runs**");
        Runnable first = new Runnable() {
            @Override
            public void run() {
                System.out.println(10/0);
            }
        };
        Runnable second = new Runnable() {
            @Override
            public void run() {
                System.out.println("running second...");
            }
        };
        //processRunnables(first, second);
        System.out.println("case 1 completes");

        System.out.println("*********case 2*********");
        //processRunnablesV1(first,second);
        // concept that below line executes even if processRunnablesV1 throws exception
        System.out.println("case 2 completes");

        System.out.println("*********case 3**********");
        processRunnablesV2(first, second, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) {
                System.out.println("exception has occured...");
                throwable.printStackTrace();
            }
        });
        System.out.println("case 3 completes");
    }


    public static void processRunnables(Runnable first, Runnable second) {
        first.run();
        second.run();
    }

    public static void processRunnablesV1(Runnable first, Runnable second) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
              first.run();
              second.run();
            }
        });
        t1.start();
    }
    public static void processRunnablesV2(Runnable first, Runnable second, Consumer<Throwable> consumer) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    first.run();
                    second.run();
                }
                catch (Exception e) {
                    consumer.accept(e);
                }
            }
        });
        t1.start();
    }
}

