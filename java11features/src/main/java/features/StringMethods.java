package features;

import java.util.stream.Collectors;

/**
 * Below new methods are added to Java 11 String class
 * isBlank()
 * lines()
 * strip(), stripLeading(), stripTrailing()
 * repeat(int)
 */
public class StringMethods {

    public static void main(String[] args) {

        //isBlank() method
        String a = " ";
        System.out.println(" is Blank  "+ a.isBlank());

        //lines() - This method returns a stream of strings, which is a collection of all substrings split by lines
        String b = "JD\nJD\nJD";
        System.out.println(b);
        System.out.println(b.lines().collect(Collectors.toList()));


        // strip(), stripLeading(), stripTrailing()
        String str = " JD ";
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");

        //repeat(int)
        String test = "=".repeat(2);
        System.out.println(test); //prints ==
    }
}
