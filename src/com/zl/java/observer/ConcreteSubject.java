package com.zl.java.observer;

/**
 * Created by rudy
 * 2016
 * 16-11-29
 * 下午2:49
 */
public class ConcreteSubject extends Subject {
  private String subjectState;
  public String getSubjectState(){
    return subjectState;
  }
  public void setSubjectState(String subjectState) {
    this.subjectState = subjectState;
    this.notifyObservers();
  }
}
