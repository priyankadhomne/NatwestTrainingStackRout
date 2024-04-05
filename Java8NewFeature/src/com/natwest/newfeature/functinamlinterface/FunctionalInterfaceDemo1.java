package com.natwest.newfeature.functinamlinterface;

class Parent{
    void phone() {
        System.out.println("Samsung");
    }
}


@FunctionalInterface
interface Test {
    void display();
    default void greetAll() {
        System.out.println("This is default method");
    }
}

public class FunctionalInterfaceDemo1 {
    public static void main(String[] args) {
        Parent parent = new Parent()
        {
            void phone() {
                System.out.println("iPhone");
            }
        };
        parent.phone();
        System.out.println("-----Without override-----");
        Parent parent1 = new Parent();
        parent1.phone();
    }
}
