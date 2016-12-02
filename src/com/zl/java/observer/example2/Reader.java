package com.zl.java.observer.example2;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by rudy
 * 2016
 * 16-11-30
 * 下午9:17
 */
public class Reader implements Observer {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void update(Observable o, Object obj) {
    //下面是采用推得方式
    System.out.println(name + "收到报纸了,阅读先.目标推过来的内容===" + obj);
    //下面是拉的方式
    System.out.println(name + "收到报纸了,阅读先.目标推过来的内容===" +
        ((NewsPaper) o).getContent());
  }
}
