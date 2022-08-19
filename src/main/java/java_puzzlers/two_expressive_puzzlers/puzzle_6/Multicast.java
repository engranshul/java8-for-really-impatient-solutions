package java_puzzlers.two_expressive_puzzlers.puzzle_6;

public class Multicast {
    public static void main(String[] args) {
        System.out.println((int) (char) (byte) -1);
        System.out.println((Long)(long)1667676769);  // works fine
        System.out.println((int) (long)1667676769);  // works fine
    }
}
