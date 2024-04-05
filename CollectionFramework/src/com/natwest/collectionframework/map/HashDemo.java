package com.natwest.collectionframework.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashDemo {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Sachin","Batsman");
        hashMap.put("Sachin","Coach");
        hashMap.put("Rohit","Batsman");
        hashMap.put("Virat","Batsman");
        hashMap.put("Virat","Batsman");
        hashMap.put("Hardik","Boller");
        hashMap.put("Chahal","Boller");
        System.out.println(hashMap);   // Not allow duplicate key but allow value , unorder

        //LinkedHashMap  = order
        //TreeMap = sorted
    }
}
