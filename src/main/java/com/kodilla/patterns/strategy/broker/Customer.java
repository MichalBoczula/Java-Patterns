package com.kodilla.patterns.strategy.broker;

public class Customer {
    final private String name;
    protected BuyPredictor buyPredictor;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String predict() {
        return buyPredictor.predictWhatToBuy();
    }

    public void setBuyingStrategy(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }
}
