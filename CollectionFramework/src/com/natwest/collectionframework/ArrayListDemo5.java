package com.natwest.collectionframework;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {

        ArrayList<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee(1,"Ram","C & I",21,80000));
        employees1.add(new Employee(3,"Meena","Tech",22,60000));
        employees1.add(new Employee(2,"Trisha","Finance",23,70000));

        System.out.println("-----Using forEach(using lambda)----");
        employees1.forEach(e-> System.out.println(e));

        System.out.println("-----Using method reference----");
        employees1.forEach(System.out::println);

        System.out.println("--using for loop----");
        for(Employee employee : employees1) {
            System.out.println(employee);
        }

    }
}
