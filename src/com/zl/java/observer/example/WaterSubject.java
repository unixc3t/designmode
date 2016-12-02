package com.zl.java.observer.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rudy
 * 2016
 * 16-11-30
 * 下午9:37
 */
public abstract class WaterSubject {
  protected List<WatcherObserver> observers = new ArrayList<>();

  //注册观察者
  public void attach(WatcherObserver observer){
   observers.add(observer);
  }
  //删除观察者
  public void detach(WatcherObserver observer){
    observers.remove(observer);
  }
  public abstract void notifyWatchers();
  public abstract int getPollLevel();
}
