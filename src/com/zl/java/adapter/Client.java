package com.zl.java.adapter;

/**
 * rudy
 * 3:23 PM
 * 1/9/17.
 */
public class Client {
    public static void  main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target =  new Adapter(adaptee);
        target.request();
    }
}
