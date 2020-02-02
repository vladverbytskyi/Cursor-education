package com.cursor.hw14.task1.client;

import com.cursor.hw14.task1.dataBase.DataBase;

public class UserReader implements Runnable {

    public static final int TIME_TO_WAIT = 3000;
    DataBase dataBase = DataBase.getDb();

    @Override
    public void run() {
        dataBase.getInfo(1, TIME_TO_WAIT);
        dataBase.getInfo(2, TIME_TO_WAIT);
        dataBase.getInfo(3, TIME_TO_WAIT);
        dataBase.getInfo(4, TIME_TO_WAIT);
        dataBase.getInfo(5, TIME_TO_WAIT);
        dataBase.getInfo(6, TIME_TO_WAIT);
        dataBase.getInfo(7, TIME_TO_WAIT);
        dataBase.getInfo(8, TIME_TO_WAIT);
        dataBase.getInfo(9, TIME_TO_WAIT);
        dataBase.getInfo(10, TIME_TO_WAIT);

    }
}
