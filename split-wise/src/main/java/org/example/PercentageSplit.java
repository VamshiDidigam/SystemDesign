package org.example;

public class PercentageSplit extends Split{

    float percentage;

    PercentageSplit(int userId, double amount, float percentage) {
        super(userId, amount);
        this.percentage = percentage;
    }

    @Override
    void validate(double amount) {

    }
}
