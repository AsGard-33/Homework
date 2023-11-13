package de.ait.homework.homework48;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("12345", "Test User");
    }

    @Test
    void deposit() {
        account.deposit(500.0);
        assertEquals(500.0, account.getBalance(), 0.001);
    }

    @Test
    void withdraw() throws BankAccount.InsufficientFundsException {
        account.deposit(500.0);
        account.withdraw(200.0);
        assertEquals(300.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawalWithException() {
        account.deposit(200.0);
        assertThrows(BankAccount.InsufficientFundsException.class, () -> {
            account.withdraw(300.0); // Это должно вызвать исключение
        });
    }
}