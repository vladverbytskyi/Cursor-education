package com.cursor.hw14.task1.controller;

import com.cursor.hw14.task1.client.UserReader;
import com.cursor.hw14.task1.client.UserWriter;

public class AppExecutor {
    public void runProgram () {
        new Thread(()->new UserWriter().run()).start();
        new Thread(()-> new UserReader().run()).start();

    }
}
