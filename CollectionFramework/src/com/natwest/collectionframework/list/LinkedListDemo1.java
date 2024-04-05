package com.natwest.collectionframework.list;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.addFirst("mango");
        fruits.addLast("papaya");
        fruits.add("PineApple");
        fruits.addFirst("Graphs");
        System.out.println(fruits);
    }
}
