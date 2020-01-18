package com.cursor.hw6.controller;

import com.cursor.hw6.task1.ListActions;
import com.cursor.hw6.task2.Fruits;
import com.cursor.hw6.task3.ElementChecker;
import com.cursor.hw6.task4.ValuesActions;

public class AppExecutor {


    public static void runApp() {
        ListActions listActions = new ListActions();
        listActions.addNumbers();
        listActions.removeNumbersDivisibleByThree();

        Fruits fruits = new Fruits();
        fruits.addFruits();
        fruits.replaceFruits();

        ElementChecker elementChecker = new ElementChecker();
        elementChecker.addElement();
        elementChecker.numListCheck();

        ValuesActions valuesActions = new ValuesActions();
        valuesActions.sortElement();
    }
}
