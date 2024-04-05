package com.natwest.newfeature.functinamlinterface;

interface Account {
    String large(int a, int b, int c);
}
public class task1 {
    public static void main(String[] args) {
        Account account = (a,b,c)->{
            if (a>b && a>c) {
                return a+" is greater";
            }
            else if (b>a && b>c) {
                return b+ " is greater";
            }
            else {
                return c + " is greater";
            }
        };
        System.out.println(account.large(4,7,5));   // Print
    }
}
