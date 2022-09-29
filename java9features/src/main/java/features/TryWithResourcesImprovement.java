package com.java9.features;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * We know, Java SE 7 has introduced a new exception handling construct: Try-With-Resources to manage resources automatically.
 * The main goal of this new statement is “Automatic Better Resource Management”.
 */
public class TryWithResourcesImprovement {

    public static void main(String[] args) throws IOException {

        // In Java 7
        BufferedReader br = new BufferedReader(new FileReader("readme.txt"));
        try (BufferedReader reader2 = br) {
            System.out.println(reader2.readLine());
        }

        //Java 9
        BufferedReader bufferedReader = new BufferedReader(new FileReader("readme.txt"));
        try (bufferedReader) {
            System.out.println(bufferedReader.readLine());
        }

    }
}
