package com.natwest.newfeature.functinamlinterface;
interface Payment{
    void doPayment();
}

public class FunctionalInterface2 {
    public static void main(String[] args) {
        Payment payment = () -> System.out.println("Doing the payment in cash");
        payment.doPayment();

        Payment payment1 = () -> System.out.println("online transfer payment");
        payment1.doPayment();
    }
}
