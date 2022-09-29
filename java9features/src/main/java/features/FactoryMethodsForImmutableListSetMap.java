package com.java9.features;


import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author piksel
 */
public class FactoryMethodsForImmutableListSetMap {

    public static void main(String[] args) {

        //Immutable list - 2 new methods
        var emptyImmutableList = List.of();
        System.out.println("empty immutable list " + emptyImmutableList);

        var immutableList = List.of("java", "demo");
        System.out.println("Immutable list with elements " + immutableList);

        //Immutable set - 2 new methods
        var emptyImmutableSet = Set.of();
        System.out.println("empty immutable set " + emptyImmutableSet);

        var immutableSet = Set.of("1", "2", "3");
        System.out.println(immutableSet);

        //Map - Immutable map with 2 new methods - 'of' and 'ofEntries'
        var emptyImmutableMap = Map.of();
        System.out.println(emptyImmutableMap);

        var immutableMap = Map.of(1, "one", 2, "two", 3, "threee");
        System.out.println(immutableMap);


    }
}
