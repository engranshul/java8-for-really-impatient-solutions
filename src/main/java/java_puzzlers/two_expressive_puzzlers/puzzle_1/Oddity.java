package java_puzzlers.two_expressive_puzzlers.puzzle_1;

public class Oddity {
    // 1 Byte = 8 bits
    // int is a 32 bit integer ie 4 byte
    public static boolean isOdd(int i) {
        int result = i % 2;
        System.out.println("result is "+result);
        return result == 1;
    }

    public static void main(String[] args) {
        System.out.println(Integer.bitCount(10)); // tells no of set bits
        System.out.println(isOdd(12345567));
        System.out.println(isOdd(-12345567));
    }
}

// By default, the int data type is a 32-bit signed two's complement integer,
// which has a minimum value of -2^31 and a maximum value of 2^31-1.
// In Java SE 8 and later, you can use the int data type to represent an
// unsigned 32-bit integer, which has a minimum value of 0 and a maximum
// value of 2^32-1.

// Think about the sign of the operands and of the result whenever u use
// the remainder operator

