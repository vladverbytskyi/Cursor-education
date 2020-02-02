package com.cursor.hw14.task1.client;

import com.cursor.hw14.task1.dataBase.DataBase;

public class UserWriter implements Runnable {

    DataBase dataBase =  DataBase.getDb();

    @Override
    public void run() {
        dataBase.addInfo(1, "transaction 1");
        dataBase.addInfo(2, "transaction 2");
        dataBase.addInfo(3, "transaction 3");
        dataBase.addInfo(4, "transaction 4");
        dataBase.addInfo(5, "transaction 5");
        dataBase.addInfo(6, "transaction 6");
        dataBase.addInfo(7, "transaction 7");
        dataBase.addInfo(8, "transaction 8");
        dataBase.addInfo(9, "transaction 9");
        dataBase.addInfo(10, "transaction 10");

    }
}
