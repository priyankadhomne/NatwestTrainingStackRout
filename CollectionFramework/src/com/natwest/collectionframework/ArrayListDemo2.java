package com.natwest.collectionframework;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(44);

        System.out.println(num);
        num.remove(Integer.valueOf(12));

        System.out.println("After Removing " + num);
        System.out.println("Size of arraylist : " + num.size());
    }
}
