package com.zl.java.adapter.example;

import java.io.*;
import java.util.List;

/**
 * rudy
 * 12:56 PM
 * 1/9/17.
 */
public class LogFileOperate implements LogFileOperateApi {

    private String logFilePathName = "AdapterLog.log";

    public LogFileOperate(String logFilePathName) {
        if(logFilePathName != null && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }

    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;
        try{
            File f = new File(logFilePathName);

            if(f.exists())  {
                oin= new ObjectInputStream(new BufferedInputStream(new FileInputStream(f))) ;
                list = (List<LogModel>)oin.readObject();
            }
        }catch (Exception e) { e.printStackTrace();}
        finally {
            try{
                if (oin != null) {
                    oin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        File f = new File(logFilePathName);
        ObjectOutputStream oout = null;
        try{
            oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            oout.writeObject(list);
        }catch (Exception e) { e.printStackTrace();}
        finally {
            try{
                if (oout != null) {
                    oout.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
