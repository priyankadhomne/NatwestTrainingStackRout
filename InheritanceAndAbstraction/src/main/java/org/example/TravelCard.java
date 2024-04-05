package org.example;

public class TravelCard extends PrepaidCard implements Rewardable {
    private double rewardPoints;

    public TravelCard(int cardNumber, double availableBalance, double swipeLimit) {
        super(cardNumber, availableBalance, swipeLimit);
        this.rewardPoints = 0;
    }


    @Override
    public boolean swipeCard(double amount) {
        double NIRamount = amount * 60;
        if (NIRamount < getSwipeLimit() && NIRamount < getAvailableBalance()) {
            setAvailableBalance(getAvailableBalance()-NIRamount);
            setAvailableBalance(getAvailableBalance() - (NIRamount* 0.5));
            rewardPoints += calculateReward(amount);
            return true;
        }
        return false;
    }

    @Override
    public int calculateReward(double amount) {
        return (int)(amount*0.1);
    }

}
