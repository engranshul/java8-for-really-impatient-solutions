package java_puzzlers.three_puzzlers_with_character.puzzle_11;

public class LastLaugh {
    public static void main(String args[]) {

        char input = 'a';
        System.out.println(input);  // a

        System.out.println("H" + "a");

        System.out.println('H' + 'a');

        // one way to concatenate characters
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('H').append('a');
        System.out.println(stringBuilder.toString());

        // another way
        System.out.println(""+'H'+'a');
    }
}

// The + operator performs string concatenation if and only if at least
// one of its operands is of type string..otherwise it performs addition

// System is a class
// out is a static method in System class and return PrintStream
// PrintStream has a print method which is overloaded for diff types

