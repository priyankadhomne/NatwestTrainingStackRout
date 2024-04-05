package com.natwest.newfeature.methodReference;


interface Addition{
    int add(int a, int b);
    //int sub(int a, int b);
}

public class ReferenceToNonStatic {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Addition addition = calculation::plus;
        System.out.println(addition.add(2,4));
        Addition addition1 = calculation::minus;
        System.out.println(addition1.add(4,3));

    }
}
