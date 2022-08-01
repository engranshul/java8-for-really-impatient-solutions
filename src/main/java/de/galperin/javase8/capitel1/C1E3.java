package de.galperin.javase8.capitel1;

import de.galperin.javase8.Exercise;
import org.junit.Test;
import java.io.File;
import java.util.Arrays;


public class C1E3 implements Exercise{

    @Test
    @Override
    public void perform() {
        File[] files = list(".", "xml");
        Arrays.asList(files).forEach(System.out::println);
    }

    private static File[] list(String dir, String ext) {
        File dirFile = new File(dir);
        return dirFile.listFiles(f -> {
            System.out.println("inside lambda");
            // ext = "random stuff";  // wont work
            return f.getName().endsWith(ext);});
    }
}
