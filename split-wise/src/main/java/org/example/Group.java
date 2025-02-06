package org.example;

import java.util.ArrayList;
import java.util.List;

public class Group {

    int id;
    String name;
    List<User> users;
    List<Expense> expenses;


    Group(int id, String name) {
        this.id = id;
        this.name = name;
        users = new ArrayList<>();
        expenses = new ArrayList<>();
    }

    void addExpense(Expense expense) {
        this.expenses.add(expense);
    }

    void addUser(User user) {
        this.users.add(user);
    }

    void printExpenses() {
        for(Expense expense: expenses) {
            System.out.println("paid by "+ expense.paidByUserId + " amount:" + expense.amount);
        }
    }

    void printGroupBalances() {
        System.out.println("printing balances..");
    }
}
