package com.cursor.hw9.task3;

public class Rethrowing {
    public void throwArithmeticExceptionMethodSecond() throws Exception {
        throwArithmeticExceptionMethodFirst();
    }

    public void throwArithmeticExceptionMethodFirst() throws Exception {
        throw new Exception();
    }
}
