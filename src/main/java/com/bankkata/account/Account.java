package com.bankkata.account;
import com.bankkata.Service.AccountService;
import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService {
    private int balance = 0;
    private List<Transaction> transactions = new ArrayList<>();

    @Override
    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant doit être positif");
        }
        balance += amount;
        transactions.add(new Transaction("Dépôt", amount, balance));
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant doit être positif");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Fonds insuffisants");
        }
        balance -= amount;
        transactions.add(new Transaction("Retrait", amount, balance));
    }

    @Override
    public void printStatement() {
        System.out.println("Date | Type | Montant | Solde");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
