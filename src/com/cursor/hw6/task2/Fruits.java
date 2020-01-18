package com.cursor.hw6.task2;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    List<String> list = new ArrayList<>();

    public void addFruits() {
        list.add("Lemon");
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        list.add("Avocado");
        System.out.println("List before replace: " + list);
    }

    public void replaceFruits(){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Orange")) {
                list.set(i, "Grapefruit");
            } else {
                System.out.println("That value not present :) ");
            }
        }
        System.out.println("list after replace " + list);
    }
 }
