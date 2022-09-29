package com.java9.features.privatemethodsinInterface;

/**
 * @author piksel
 */
public class PrivateMethodInInterfaceImpl implements  PrivateMethodInInterface {

    @Override
    public void show() {
        System.out.println(" overriding parent show ");
    }
}
