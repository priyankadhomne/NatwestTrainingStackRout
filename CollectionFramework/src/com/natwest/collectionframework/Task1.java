package com.natwest.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> bag1 = new ArrayList<>();
        bag1.add("Biscuit");
        bag1.add("lays");
        bag1.add("ice-cream");
        bag1.add("burger");
        bag1.add("maggi");
        bag1.add("water");

        ArrayList<String> bag2 = new ArrayList<>();
        bag2.add("maggi");
        bag2.add("water");
        bag2.add("cake");
        bag2.add("biryani");
        bag2.add("sandwich");

        bag1.removeAll(bag2);
        bag1.addAll(bag2);
        Collections.sort(bag1);
        System.out.println("After sorting in ascending order and removing duplicate : " + bag1);
    }
}
