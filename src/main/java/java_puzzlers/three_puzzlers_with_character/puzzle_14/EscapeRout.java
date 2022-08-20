package java_puzzlers.three_puzzlers_with_character.puzzle_14;

public class EscapeRout {

  public static void main(String[] args) {
    String input =  "anshulchauhan";
    System.out.println(input.length());

    // \u0022 is the Unicode escape for double-quote (")
    System.out.println("a\u0022.length() + \u0022b".length());
  }
}

// Unicode is a universal international standard character encoding that is
// capable of representing most of the world's written languages.

//  Before Unicode, there were many language standards:
//        ASCII (American Standard Code for Information Interchange) for the United States.
//        ISO 8859-1 for Western European Language.
//        KOI-8 for Russian.
//        GB18030 and BIG-5 for chinese, and so on.

//  This caused two problems:
//        A particular code value corresponds to different letters in the various language
//        standards.
//        The encodings for languages with large character sets have variable length.
//        Some common characters are encoded as single bytes, other require two or
//        more byte.

//  To solve these problems, a new language standard was developed i.e. Unicode System.
//        In unicode, character holds 2 byte, so java also uses 2 byte for characters.
//        lowest value:\u0000
//        highest value:\uFFFF

// " is represented as \u0022 in unicode
// https://www.branah.com/unicode-converter