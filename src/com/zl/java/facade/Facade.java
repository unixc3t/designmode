package com.zl.java.facade;

/**
 * rudy
 * 9:55 PM
 * 12/25/16.
 */
/*
    外观类
 */
public class Facade {
    public void test() {
        AModuleApi a = new AModuleImpl();
        a.testA();
        BMdouleIMpl b = new BMdouleIMpl();
        b.testB();
    }
}
