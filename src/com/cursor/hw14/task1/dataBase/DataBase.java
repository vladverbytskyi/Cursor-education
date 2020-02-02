package com.cursor.hw14.task1.dataBase;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DataBase {

    public Map<Integer, String> transactionList = new HashMap<>();
    private static DataBase instance;

    private DataBase() {

    }
    public static DataBase getDb () {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    public void addInfo (Integer key, String value) {
        synchronized (transactionList) {
            transactionList.put(key, value);
            System.out.println("add " + transactionList.put(key, value));
        }
    }

    public void getInfo (Integer key, Integer timeToWait) {
        final Date deadLine = new Date(System.currentTimeMillis() + timeToWait);
        while (transactionList.containsKey(key) && new Date().before(deadLine)) {
            transactionList.get(key);
            System.out.println("get " + transactionList.get(key));
            try {
                Thread.sleep(timeToWait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
