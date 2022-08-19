package java_puzzlers.three_puzzlers_with_character.puzzle_12;

import java.util.Arrays;
import java.util.List;

public class Abc {
    public static void main(String[] args) {

        String letters = "ABC";
        char[] numbers = { '1', '2', '3' };
        Object obj = new char[] {'1', '2', '3'};
        List<Character> nums = Arrays.asList('1','2','3');

        System.out.println(letters + " easy as " + numbers);
        System.out.println(letters + " easy as " + nums);

        System.out.println(numbers); // calls char[] overloading
        System.out.println(obj);           // calls object overloading
    }
}

// char arrays are not strings..to convert a char array to a string, invoke
// String.value(char[])

// see how u found ArrayList toString() in its parent class AbstractCollection
