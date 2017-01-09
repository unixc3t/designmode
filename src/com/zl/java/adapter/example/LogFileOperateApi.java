package com.zl.java.adapter.example;

import java.util.List;

/**
 * rudy
 * 12:39 PM
 * 1/9/17.
 */
public interface LogFileOperateApi {
    public List<LogModel> readLogFile();
    public void writeLogFile(List<LogModel> list);
}
