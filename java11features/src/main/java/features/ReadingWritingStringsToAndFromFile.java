package features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Reading/Writing Strings to and from the Files
 * Java 11 strives to make reading and writing of String convenient.
 * It has introduced the following methods for reading and writing to/from the files:
 *
 * readString()
 * writeString()
 */
public class ReadingWritingStringsToAndFromFile {


    public static void main(String[] args) throws IOException {
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), " I am writing to a file");
        System.out.println(path);

        String output = Files.readString(path);
        System.out.println(" " + output);
    }


}
