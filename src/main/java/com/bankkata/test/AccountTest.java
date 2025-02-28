package com.bankkata.test;

import com.bankkata.account.Account;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testBankStatement() {
       
        Account account = new Account();

        
        account.deposit(1000);  
        account.deposit(2000);  
        account.withdraw(500);  

        
        account.printStatement();  
    }

    @Test
    void testWithdrawalExceedsBalance() {
        Account account = new Account();
        account.deposit(1000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(2000));
    }

    @Test
    void testDepositNegativeAmount() {
        Account account = new Account();
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-500));
    }

    @Test
    void testWithdrawNegativeAmount() {
        Account account = new Account();
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-500));
    }
}
