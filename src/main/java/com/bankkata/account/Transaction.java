package com.bankkata.account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private final String type;
    private final int amount;
    private final int balanceAfterTransaction;
    private final LocalDateTime date;

    public Transaction(String type, int amount, int balanceAfterTransaction) {
        this.type = type;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return date.format(formatter) + " | " + type + " | " + amount + " | Solde: " + balanceAfterTransaction;
    }
}
