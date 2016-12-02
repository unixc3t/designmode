package com.zl.java.observer.example;

/**
 * Created by rudy
 * 2016
 * 16-11-30
 * 下午10:17
 */
public class Watcher implements WatcherObserver{

  private String job;

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Override
  public void update(WaterSubject subject) {
    System.out.println(job+"获取通知,当前污染级别为:"+subject.getPollLevel());
  }
}
