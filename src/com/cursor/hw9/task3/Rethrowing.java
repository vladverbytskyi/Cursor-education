package com.cursor.hw9.task3;

public class Rethrowing {
    public void someFirstMethod() throws Exception {
        someSecondMethod();
    }

    public void someSecondMethod() throws Exception {
        throw new Exception();
    }
}
