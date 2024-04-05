package com.natwest.exceptionhandling;

public class ExceptionDEmo3 {
    public static void main(String[] args) {
        try {
            System.out.println("Hello");
            System.out.println(2/0);
            System.out.println("Welcome");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();     // it will return the detail of exception.
        }
    }
}
