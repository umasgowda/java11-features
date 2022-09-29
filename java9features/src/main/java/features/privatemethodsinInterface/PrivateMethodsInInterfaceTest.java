package com.java9.features.privatemethodsinInterface;

/**
 * @author piksel
 */
public class PrivateMethodsInInterfaceTest {

    public static void main(String[] args) {
        PrivateMethodInInterface pv = new PrivateMethodInInterfaceImpl();
        pv.show();
        PrivateMethodInInterface.demoStaticMethod();
        pv.defaultMethodDemo(1, 2);

    }
}
