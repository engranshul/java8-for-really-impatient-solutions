package java_puzzlers.three_puzzlers_with_character.puzzle_16;

public class LinePrinter {
  public static void main(String[] args) {
    // Note: \u000A is Unicode representation of linefeed (LF)
    char c = 0x000A;
    System.out.println(c);
  } 
}


// \u000A represents new line so text after it goes to next line and remains
// uncommented