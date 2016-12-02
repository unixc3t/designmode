package com.zl.java.observer;

/**
 * Created by rudy
 * 2016
 * 16-11-29
 * 下午3:26
 */
public class ConcreteObserver implements Observer {
  private String observerState;

  @Override
  public void update(Subject subject) {
    observerState = ((ConcreteSubject) subject).getSubjectState();
  }
}
