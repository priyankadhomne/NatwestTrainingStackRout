package com.natwest.collectionframework.streamapi;

import com.natwest.collectionframework.Employee;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee(1,"Ram","C & I",21,70000));
        employees1.add(new Employee(3,"Meena","Tech",23,60000));
        employees1.add(new Employee(2,"Trisha","Finance",20,70000));
    }
}

//class AgeSorting implements Comparator<Employee> {
//
//    @Override
//    public int compareTo(Employee o1, Employee o2) {
//        if ()
//        return 0;
//    }
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return 0;
//    }
//}
