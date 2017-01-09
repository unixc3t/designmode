package com.zl.java.adapter.example;

import java.io.Serializable;

/**
 * rudy
 * 12:37 PM
 * 1/9/17.
 */
public class LogModel implements Serializable{
    private String logId;
    private String operateUser;
    private String operateTime;
    private String content;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "LogModel{" +
                "logId='" + logId + '\'' +
                ", operateUser='" + operateUser + '\'' +
                ", operateTime='" + operateTime + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
