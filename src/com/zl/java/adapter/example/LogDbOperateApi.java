package com.zl.java.adapter.example;

import java.util.List;

/**
 * rudy
 * 1:59 PM
 * 1/9/17.
 */
public interface LogDbOperateApi{
    public void createLog(LogModel lm);
    public void updatLog(LogModel lm);
    public void removeLog(LogModel lm);
    public List<LogModel> getAllLog();

}
