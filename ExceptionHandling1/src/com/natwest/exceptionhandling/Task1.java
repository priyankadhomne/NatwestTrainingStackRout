package com.natwest.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("Final answer is : " + (a/b));
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by 0 ");
        }
        catch (InputMismatchException ex) {
            System.out.println("Enter only numbers");
        }

    }
}
