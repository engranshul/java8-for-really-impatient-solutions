package de.galperin.javase8.capitel3.practice;

import java.util.function.BiFunction;

public class ReturningFunctions {
    public static void main(String[] args) {
      BiFunction<Integer,Integer,Integer> myFunc =returnAdditionFactory();
      Integer result = myFunc.apply(2,3);
      System.out.println(result);
    }

    // function returning function concept
    public  static BiFunction<Integer,Integer,Integer> returnAdditionFactory() {
         return new BiFunction<Integer, Integer, Integer>() {
             @Override
             public Integer apply(Integer val1, Integer val2) {
                 return val1+val2;
             }
         };
    }
}
