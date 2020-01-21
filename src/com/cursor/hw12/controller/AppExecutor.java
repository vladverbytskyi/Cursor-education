package com.cursor.hw12.controller;

import com.cursor.hw12.task1.LFUCache;
import com.cursor.hw12.task1.News;

public class AppExecutor {
    LFUCache cache = new LFUCache(5);
    News news = new News();

    public void runProgram() {
        news.addNews();
        System.out.println("Going to test the LFU Cache Implementation");

        cache.put(1L, news.getValue("Warm"));
        cache.put(2L, news.getValue("Danger"));
        cache.put(3L, news.getValue("Volcano"));
        cache.put(4L, news.getValue("Shoots Plane"));
        cache.put(5L, news.getValue("Awkwafina"));
        cache.put(6L, news.getValue("Protests"));
        cache.put(7L, news.getValue("Bomb"));
        cache.put(8L, news.getValue("Airlines"));
        cache.put(9L, news.getValue("Internet"));
        cache.put(10L, news.getValue("Sudan"));

        for (long i = 1L; i <= 10; i++) {
            if (cache.get(i) != null) {
                System.out.println("Value for the key " + i + " is " + cache.get(i));
            }
        }
    }
}
