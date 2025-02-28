package com.bankkata.Service;

import com.bankkata.account.Account;

public class AccountServiceImpl implements AccountService {

    private final Account account;

    public AccountServiceImpl(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(int amount) {
        account.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        account.withdraw(amount);
    }

    @Override
    public void printStatement() {
        account.printStatement();
    }
}
