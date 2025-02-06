package org.example;

abstract class Split {
    double amount;
    int userId;

    Split(int userId, double amount) {
        this.userId = userId;
        this.amount = amount;
    }

    abstract void validate(double amount);

}
