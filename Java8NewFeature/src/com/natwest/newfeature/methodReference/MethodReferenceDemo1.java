package com.natwest.newfeature.methodReference;

@FunctionalInterface
interface User {
    void greet();
}
class Employee {
    static void myGreeting() {
        System.out.println("employee greeting");
    }
}

public class MethodReferenceDemo1 {
    public static void main(String[] args) {
        // Implementation using lambda
        User user = ()->{
            System.out.println("Welcome to the India");
            System.out.println("Welcome to ayodhya");
        };

        // Method reference for the static method
        User user1 = Employee::myGreeting;
        user1.greet();
    }
}
