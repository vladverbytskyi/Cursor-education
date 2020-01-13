package com.cursor.hw6.controller;

import com.cursor.hw6.task1.ListActions;
import com.cursor.hw6.task2.Fruits;
import com.cursor.hw6.task3.ElementChecker;
import com.cursor.hw6.task4.ValuesActions;

public class AppExecutor {
    public static void runApp() {
        new ListActions().addNumbers();
        new Fruits().addFruits();
        new ElementChecker().addElement();
        new ValuesActions().sortElement();
    }
}
