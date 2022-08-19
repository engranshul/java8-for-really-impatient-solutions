package java_puzzlers.two_expressive_puzzlers.puzzle_9;

public class Tweedledum {
    public static void main(String[] args) {
        // Put your declarations for x and i here
        short x =0;
        int i = 123456;

        // compound assignment operator
        x += i;     // Must be LEGAL..contains a hidden cast..discard precision
        System.out.println(x);

        //x = x + i;  // Must be ILLEGAL because of loss pf precision
    }
}
