package com.natwest.stramproject.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Student");
        int noOfStudent = sc.nextInt();

        ArrayList<Integer> marksOfStudent = new ArrayList<>(noOfStudent);
        for (int i=0; i<noOfStudent; i++) {
            System.out.println("Enter the Marks of Students " + i+1 + " -");
            marksOfStudent.add(sc.nextInt());
        }

        System.out.println(" highest mark scored by the student");
        Integer n = marksOfStudent.stream().max(Comparator.comparingInt(i->i)).orElse(Integer.MIN_VALUE);
        System.out.println(n);

        System.out.println("Average marks scored by the Student");
        Integer n1 = (int)(marksOfStudent.stream().mapToInt(Integer::intValue).average()).orElseThrow();
        System.out.println(n1);

        System.out.println("marks stored by the 3rd Student");
        System.out.println(marksOfStudent.get(2));

        System.out.println("Total Marks in Sorted order");
        marksOfStudent.stream().sorted(Comparator.comparingInt(i->i)).forEach(System.out::println);
    }
}
