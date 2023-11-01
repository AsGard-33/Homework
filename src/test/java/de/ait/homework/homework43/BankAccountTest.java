package de.ait.homework.homework43;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;
    //В главном классе или тестовом классе создайте несколько экземпляров класса BankAccount.
    //Проведите различные операции с аккаунтами: пополнение, снятие средств, проверка баланса.
    //Наблюдайте за результатами логирования в консоли или файле логов.

    @BeforeEach
    void setUp() {
        account = new BankAccount("Aleksej Nazarov", 1000);
    }

    @Test
    void deposit() {
        account.deposit(500);
        assertEquals(1500, account.checkBalance());
    }

    @Test
    void withdraw() {
        account.withdraw(500);
        assertEquals(500, account.checkBalance());
    }
    @Test
    void withdrawDoesNotSubtractAmountIfInsufficientFunds() {
        account.withdraw(1100);
        assertEquals(1000, account.checkBalance());
    }

    @Test
    void checkBalance() {
        assertEquals(1000, account.checkBalance());
    }
}