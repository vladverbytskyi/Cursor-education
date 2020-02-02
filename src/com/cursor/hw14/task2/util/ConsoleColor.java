package com.cursor.hw14.task2.util;

public enum ConsoleColor {

    GREEN("\033[0;32m"), MAGENTA("\033[0;35m"), CYAN("\033[0;36m"), RESET("\033[0m");

    private final String code;

    ConsoleColor(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
