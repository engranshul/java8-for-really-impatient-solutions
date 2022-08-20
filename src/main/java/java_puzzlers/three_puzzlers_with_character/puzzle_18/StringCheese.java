package java_puzzlers.three_puzzlers_with_character.puzzle_18;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringCheese {
    public static void main(String args[]) throws UnsupportedEncodingException {

        byte bytes[] = new byte[256];    
        for(int i = 0; i < 256; i++)
            bytes[i] = (byte)i;
        System.out.println(Arrays.toString(bytes));

        // try both
        //String str = new String(bytes);
        String str = new String(bytes,"ISO-8859-1");
        for(int i = 0, n = str.length(); i < n; i++)
            System.out.print((int)str.charAt(i) + " ");
    }
}

// byte range is -128 to 127

// The native character encoding of the Java programming language is UTF-16.
// A charset in the Java platform therefore defines a mapping between sequences
// of sixteen-bit UTF-16 code units (that is, sequences of chars) and sequences
// of bytes.