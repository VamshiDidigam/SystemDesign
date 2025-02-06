package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "ram");
        User user2 = new User(2, "krishna");
        User user3 = new User(3, "mohan");

        Group group1 = new Group(1, "california-trip");

        group1.addUser(user1);
        group1.addUser(user2);
        group1.addUser(user3);

        Split split1 = new EqualSplit(2, 10);
        Split split2 = new EqualSplit(3, 10);
        List<Split> splits = new ArrayList<>();
        splits.add(split1);
        splits.add(split2);

        Expense expense = new Expense(1, 1, splits, 1, 20.0);

        group1.addExpense(expense);

        group1.printExpenses();
        group1.printGroupBalances();
    }
}