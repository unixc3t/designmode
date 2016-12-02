package com.zl.java.observer.example;

/**
 * Created by rudy
 * 2016
 * 16-11-30
 * 下午10:00
 */
public class WaterQuality extends WaterSubject {

  private int level = 0;

  @Override
  public void notifyWatchers() {
    for(WatcherObserver o :observers) {
      if(this.level >=0) {
         if("j".equals(((Watcher)o).getJob())){
           o.update(this);
         }
      }
      if(this.level>=1) {
       if("y".equals(((Watcher)o).getJob())) {
         o.update(this);
       }
      }
    }
  }

  @Override
  public int getPollLevel() {
    return this.level;
  }

  public void setLevel(int level) {
    this.level = level;
    this.notifyWatchers();
  }
}
