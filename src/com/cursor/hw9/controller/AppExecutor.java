package com.cursor.hw9.controller;

import com.cursor.hw9.task1.ExceptionExample;
import com.cursor.hw9.task2.SafeDivision;
import com.cursor.hw9.task3.Rethrowing;

public class AppExecutor {
    public void runProgram() {

        //task1
        ExceptionExample exceptionExample = new ExceptionExample();
        exceptionExample.showException();
        exceptionExample.catchTypeNotPresentException();
        exceptionExample.catchNulCloneableException();
        exceptionExample.catchNullPointerException();
        exceptionExample.catchIOException();

        //task2
        new SafeDivision().division();

        //task3
        try {
            new Rethrowing().someFirstMethod();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
