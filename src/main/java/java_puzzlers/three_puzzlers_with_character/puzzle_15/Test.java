package java_puzzlers.three_puzzlers_with_character.puzzle_15;

public class Test {
    /*
    *anshul \uffff
    * this program will give "illegal unicode escape error"
    * */
    public static void main(String[] args) {
        System.out.print("Hell");
        System.out.println("o world");
    }
}

// unicode escape must be well formed even if they appear in comments
