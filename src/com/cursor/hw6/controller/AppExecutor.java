package controller;

import task1.ListActions;
import task2.Fruits;
import task3.ElementChecker;
import task4.ValuesActions;

public class AppExecutor {
    public static void runApp() {

        new ListActions().addNumbers();
        new Fruits().replaceFruits();
        new ElementChecker().checkElement();
        new ValuesActions().sortElement();
    }
}
