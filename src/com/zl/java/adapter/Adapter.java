package com.zl.java.adapter;

/**
 * rudy
 * 3:08 PM
 * 1/9/17.
 */
public class Adapter implements  Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
