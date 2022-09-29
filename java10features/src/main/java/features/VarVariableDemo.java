package com.java10.features;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.journaldev.com/20395/java-10-features
 * Local-Variable Type Inference is the biggest new feature in Java 10 for developers. It adds type inference to declarations of local variables with initializers. Local type inference can be used only in the following scenarios:
 *
 * Limited only to Local Variable with initializer
 * Indexes of enhanced for loop or indexes
 * Local declared in for loop
 */
public class VarVariableDemo {

    public static void main(String[] args) {
        var mylist = Arrays.asList("my", "java11", "demo");
        System.out.println(mylist);
    }
}
