package com.zl.java.easyfactory;

/**
 * Created by rudy
 * 2016
 * 16-12-6
 * 下午11:18
 */
public class EasyFactory {


  public static Api factory(int n) {
    Api api = null;
    switch (n) {
      case 1:
        api = new ImplA();
        break;
      case 2:
        api = new ImplB();
        break;
      default:
        throw new RuntimeException("error n");
    }
    return api;
  }
}
