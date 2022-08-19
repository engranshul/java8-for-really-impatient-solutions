package java_puzzlers.two_expressive_puzzlers.puzzle_10;

public class Tweedledee {
    public static void main(String[] args) {
        // Put your declarations for x and i here
        Object x = "Buy ";
        String i = "Effective java";

        x = x + i;  // Must be LEGAL
        System.out.println(x);

        //x += i;     // Must be ILLEGAL
    }
}
