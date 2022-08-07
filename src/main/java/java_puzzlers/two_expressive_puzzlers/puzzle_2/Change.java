package java_puzzlers.two_expressive_puzzlers.puzzle_2;

import java.math.BigDecimal;

public class Change {
    public static void main(String args[]) {

        System.out.println(2.00 - 1.10);

        double res = 2.00-1.10;
        System.out.println(res);

        // correct output
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));

        // see how Double.toString call is redundant
        System.out.println(Double.toString(1.10));
    }
}

// Learning : avoid float and double where exact answers are required..
// For monetary calculations, use int,long or BigDecimal..

