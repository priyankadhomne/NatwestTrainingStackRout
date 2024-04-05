package com.natwest.collectionframework.streamapi;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Element are : " + num);

        for (Integer n : num) {
            if (n%2==0) {
                System.out.print(n+" ");
            }
        }

        num.stream().filter(i->i%2==0).forEach(s-> System.out.print(s+" "));
    }
}
