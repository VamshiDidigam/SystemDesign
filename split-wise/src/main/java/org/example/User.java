package org.example;

import java.util.*;

public class User {
    int id;
    String name;
    List<Expense> transactions;
    Map<User, Double> balanceSheet;

    User(int id, String name) {
        this.id = id;
        this.name = name;
        transactions = new ArrayList<>();
        balanceSheet = new HashMap<>();
    }

    void addExpense(Expense transaction)  {
        this.transactions.add(transaction);
    }

    void addTransaction(User user, double amount) {
        this.balanceSheet.put(user, amount);
    }

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    void printBalace() {
        for(Map.Entry<User, Double> entry: balanceSheet.entrySet()) {
            System.out.println(" USER " + entry.getKey().name + " owes " +entry.getValue());
        }
    }

    void printTransactions() {
        for(Expense expense: transactions) {
            System.out.println(expense);
        }
    }


}
