package com.natwest.newfeature.functinamlinterface;

interface Calculation{

    // Functional interface
    void add(int a, int b);
}

public class FunctionalInterfaceDemo2 {
    public static void main(String[] args) {
        Calculation calculation = (a,b) -> System.out.println(a+b);
        calculation.add(5,4);

        Calculation calculation1 = (a,b)->{
            if (a>b)
                System.out.println("a is greater");
            else
                System.out.println("b is greater");
        };
        calculation1.add(7,6);
    }
}
