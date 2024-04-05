package org.example;

public class Main {
    public static void main(String[] args) {
        TravelCard travelCard = new TravelCard(1234,5000.0,1000.0);
        if (travelCard.swipeCard(9.0)) {
            System.out.println("Successfully swipe the card");
        }
        else {
            System.out.println("Deny to Swipe");
        }


    }
}