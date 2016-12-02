package com.zl.java.observer.example;

/**
 * Created by rudy
 * 2016
 * 16-11-30
 * 下午10:24
 */
public class Launch {
  public static void main(String[] args) {
    Watcher w1 = new Watcher();
    w1.setJob("j");
    Watcher w2 = new Watcher();
    w2.setJob("y");

    WaterQuality waterQuality = new WaterQuality();
    waterQuality.attach(w1);
    waterQuality.attach(w2);

    waterQuality.setLevel(1);
  }
}
