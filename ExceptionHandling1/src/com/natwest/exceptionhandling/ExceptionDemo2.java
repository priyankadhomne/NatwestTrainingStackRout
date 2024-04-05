package com.natwest.exceptionhandling;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("Get Ready");
        System.out.println("Breakfast");
        System.out.println("Travel for 30 minutes");
        try {
            System.out.println(2/0);
            System.out.println("Login");
        }
       catch (Exception e) {
           System.out.println("Exception occur");
       }
        System.out.println("Access");
        System.out.println("Start the day");
    }
}

