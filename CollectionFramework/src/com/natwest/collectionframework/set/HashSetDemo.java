package com.natwest.collectionframework.set;

import com.natwest.collectionframework.Employee;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Minakumari");
        names.add("Hitesh");
        names.add("Hitesh");

        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee(1,"Shree","Tech",24,70000));
        employees.add(new Employee(1,"Shree","Tech",24,70000));
        System.out.println(employees);
        System.out.println(names);
    }
}
