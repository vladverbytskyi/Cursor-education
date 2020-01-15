package com.cursor.hw9.task1;

import java.io.IOException;

public class ExceptionExample {
    public void showException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void catchTypeNotPresentException() {
        try {
            throw new TypeNotPresentException();
        } catch (TypeNotPresentException typeNotPresentException) {
            typeNotPresentException.printStackTrace();
        }
    }

    public void catchNulCloneableException() {
        try {
            throw new NulCloneableException();
        } catch (NulCloneableException exceptionB) {
            exceptionB.printStackTrace();
        }
    }

    public void catchNullPointerException() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
    }

    public void catchIOException() {
        try {
            throw new IOException();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
