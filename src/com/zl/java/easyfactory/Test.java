package com.zl.java.easyfactory;

/**
 * Created by rudy
 * 2016
 * 16-12-6
 * 下午11:24
 */
public class Test {
  public static void main(String[] args) {
    Api api = EasyFactory.factory(1);
    api.operation("hello");
     api = EasyFactory.factory(2);
    api.operation("hello");
  }
}
