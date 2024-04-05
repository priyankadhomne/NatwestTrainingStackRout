package com.natwest.collectionframework;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // primitive
        int salary = 40000;

        // Object
        Integer sal = salary;
        System.out.println(sal.getClass());

        Integer id = 1;
        int x = id;
        System.out.println(x);

    }
}
