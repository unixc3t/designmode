package com.zl.java.observer.example2;

import java.util.Observable;

/**
 * Created by rudy
 * 2016
 * 16-11-30
 * 下午9:14
 */
public class NewsPaper extends Observable {
  private String content;

  public String getContent() {
   return this.content;
  }

  public void setContent(String content) {
    this.content = content;
    this.setChanged();
    this.notifyObservers(this.content); //推的方式
    this.notifyObservers();//拉的方式
  }

}
