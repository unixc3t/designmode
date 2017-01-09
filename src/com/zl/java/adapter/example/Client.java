package com.zl.java.adapter.example;

import java.util.ArrayList;
import java.util.List;

/**
 * rudy
 * 1:16 PM
 * 1/9/17.
 */
public class Client {
    public static void main(String[] args) {
        //old version
/*        LogModel lm1 = new LogModel();
        lm1.setLogId("001");
        lm1.setOperateUser("admin");
        lm1.setOperateTime("2010-03-02 10:08:18");
        lm1.setContent("this is test");

        List<LogModel> list = new ArrayList<>();
        list.add(lm1);
        LogFileOperate api = new LogFileOperate("");

        api.writeLogFile(list);

        List<LogModel> readLog = api.readLogFile();
        System.out.println("readLog="+readLog);*/


        LogModel lm1 = new LogModel();
        lm1.setLogId("001");
        lm1.setOperateUser("admin");
        lm1.setOperateTime("2010-03-02 10:08:18");
        lm1.setContent("this is test");
        List<LogModel> list = new ArrayList<>();
        list.add(lm1);

        LogFileOperateApi logFileOperateApi = new LogFileOperate("");
        LogDbOperateApi logDbOperateApi = new Adapter(logFileOperateApi);

        logDbOperateApi.createLog(lm1);


    }
}
