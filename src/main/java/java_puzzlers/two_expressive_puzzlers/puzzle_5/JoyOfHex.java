package java_puzzlers.two_expressive_puzzlers.puzzle_5;

public class JoyOfHex {
    public static void main(String[] args) {

        System.out.println(Integer.toHexString(1));     // 1
        System.out.println(Integer.toHexString(10));   // a
        System.out.println(Integer.toHexString(11));   // b
        System.out.println(Integer.toHexString(15));   // f

        System.out.println(Integer.toHexString(-1));     // way to represent negative nos..doesnt use - sign like int or long

        System.out.println(Integer.toHexString(16));   // see how it prints 10

        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
    }
}


// Hexadecimal is a numbering system with base 16. It can be used to represent large
// numbers with fewer digits. In this system there are 16 symbols or possible digit values
// from 0 to 9, followed by six alphabetic characters -- A, B, C, D, E and F.