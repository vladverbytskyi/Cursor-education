package com.cursor.hw6.task3;

import java.util.ArrayList;
import java.util.List;

public class ElementChecker {
    List<Integer> firstList = new ArrayList<>();
    List<Integer> secondList = new ArrayList<>();

    public void addElement() {
        firstList.add(2);
        firstList.add(5);
        firstList.add(11);
        firstList.add(15);
        firstList.add(564);
        firstList.add(784);
        firstList.add(864);

        secondList.add(18);
        secondList.add(321);
        secondList.add(148);
        secondList.add(2);
        secondList.add(5615);
        secondList.add(15);
        secondList.add(185);

        System.out.println("List 1 contains: " + firstList);
        System.out.println("List 2 contains: " + secondList);
     }

     public void numListCheck(){
         for (Integer integer : firstList) {
             for (Integer value : secondList) {
                 if (integer.equals(value)) {
                     System.out.println("Similar element: " + integer);
                 }
             }
         }
     }
}
