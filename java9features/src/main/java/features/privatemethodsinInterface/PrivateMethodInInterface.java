package com.java9.features.privatemethodsinInterface;

/**
 * Using private methods in interfaces have four rules :
 *
 * 1. Private interface method cannot be abstract.
 * 2. Private method can be used only inside interface.
 * 3. Private static method can be used inside other static and non-static interface methods.
 * 4. Private non-static methods cannot be used inside private static methods.
 */
public interface PrivateMethodInInterface {

    static void demoStaticMethod() {
        System.out.println("Java 8 feature - static method implementation in interface");
    }

    void show();

    default void defaultMethodDemo(int a, int b) {
        System.out.println("java 8 feature - default method implementation in interface ");
        var result = add(a, b);
        System.out.println(" addition of 2 numbers " + result);
    }

    private int add(int a, int b) {
        System.out.println("java 9 feature - private method in interface");
        return a + b;
    }
}
