package com.natwest.newfeature.functinamlinterface;

interface Calculation2 {
    int add(int a, int b);
}

public class FunctionInterfaceWithReturnType {
    public static void main(String[] args) {
        Calculation2 calculation1 = (a,b)->a+b;
        Calculation2 calculation2 = (a,b) -> {
            if (a>b)
                return a;
            return b;
        };
        System.out.println(calculation1.add(2,3));
        System.out.println(calculation2.add(5,6));
    }
}
