package org.example;

import java.util.List;

public class Expense {
    int id;
    int paidByUserId;
    int groupId;
    double amount;
    List<Split> splits;

    Expense(int id, int userId, List<Split> splits, int groupId, double amount) {
        this.id = id;
        this.paidByUserId = userId;
        this.splits = splits;
        this.groupId = groupId;
        this.amount = amount;
    }
}
