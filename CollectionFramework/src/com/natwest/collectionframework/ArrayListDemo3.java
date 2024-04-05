package com.natwest.collectionframework;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Graphs");
        fruits.add("Mango");
        fruits.add(0,"Cherry");
        fruits.add("Banana");
        System.out.println("Fruits : " + fruits);
        System.out.println(fruits.contains("Apple"));
        fruits.remove("Mango");
        System.out.println(fruits);
        System.out.println("Return number of elements : " + fruits.size());
        fruits.set(0,"PineApple");
        System.out.println("After change : " + fruits);
    }
}
