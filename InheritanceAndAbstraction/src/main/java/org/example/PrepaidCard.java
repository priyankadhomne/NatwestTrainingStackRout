package org.example;

abstract class PrepaidCard {
    private int cardNumber;
    private double availableBalance;
    private double swipeLimit;

    public PrepaidCard(int cardNumber, double availableBalance, double swipeLimit) {
        this.cardNumber = cardNumber;
        this.availableBalance = availableBalance;
        this.swipeLimit = swipeLimit;
    }

    abstract public boolean swipeCard(double amount);
    public void rechargeCard(double amount) {
        availableBalance += amount;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public double getSwipeLimit() {
        return swipeLimit;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public void setSwipeLimit(double swipeLimit) {
        this.swipeLimit = swipeLimit;
    }

    @Override
    public String toString() {
        return "PrepaidCard{" +
                "cardNumber=" + cardNumber +
                ", availableBalance=" + availableBalance +
                ", swipeLimit=" + swipeLimit +
                '}';
    }
}
