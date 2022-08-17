package java_puzzlers.two_expressive_puzzlers.puzzle_3;

public class LongDivision {
    public static void main(String[] args) {
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;

        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
}

// Why it doesnt print 1000, problem is that computation is performed
// entirely in int arithmetic and only after computation completes, its
// result is promoted to long..it's too late..

// why is computation performed in int arithmetic
// Because all the factors that are multiplied together are int values..
// When u multiply two int values,u get another int value

// Java doesnt have target typing,a language feature wherein the type
// of the variable in which a result is to be stored influences the type
// of the computation..

// It is easy to fix the program by using a long literal in place of an int
// as the first factor in each product




