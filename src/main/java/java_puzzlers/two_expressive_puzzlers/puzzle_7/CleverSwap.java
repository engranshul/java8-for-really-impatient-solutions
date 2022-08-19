package java_puzzlers.two_expressive_puzzlers.puzzle_7;

public class CleverSwap {
    public static void main(String[] args) {
        int x = 1984;
        int y = 2001;
        x ^= y ^= x ^= y;
        System.out.println("x = " + x + "; y = " + y);
    }
}

// Do not assign the same variable more than once in a single expression
// Expressions containing multiple assignments to the same variable are
// confusing and seldom do wat u want..

