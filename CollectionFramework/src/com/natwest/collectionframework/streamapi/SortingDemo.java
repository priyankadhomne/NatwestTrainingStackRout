package com.natwest.collectionframework.streamapi;

import com.natwest.collectionframework.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingDemo {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,4,7,9,5));
        Collections.sort(num);

        ArrayList<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee(1,"Ram","C & I",21,70000));
        employees1.add(new Employee(3,"Meena","Tech",23,60000));
        employees1.add(new Employee(2,"Trisha","Finance",20,70000));

        // comparable by one object
        Collections.sort(employees1);
        employees1.forEach(System.out::println);
    }
}
