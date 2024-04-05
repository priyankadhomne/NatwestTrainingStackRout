package com.natwest.collectionframework.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();     // unorder
        hashSet.add("Graphs");
        hashSet.add("Apple");
        hashSet.add("Graphs");
        hashSet.add("Banana");
        System.out.println("------HashSet------");
        System.out.println(hashSet);

        LinkedHashSet<String> linkedList = new LinkedHashSet<>();   // order
        linkedList.add("Rose");
        linkedList.add("Hibiscus");
        linkedList.add("Rose");
        linkedList.add("Lily");
        linkedList.add("Mogra");
        System.out.println("------LinkedHashSet------");
        System.out.println(linkedList);

        TreeSet<String> treeSet = new TreeSet<>();      //Sorted
        treeSet.add("Raja");
        treeSet.add("Shirlin");
        treeSet.add("Mitali");
        treeSet.add("Dharti");
        treeSet.add("Dharti");
        treeSet.add("Dhara");
        System.out.println("------Treeset------");
        System.out.println(treeSet);

    }
}
