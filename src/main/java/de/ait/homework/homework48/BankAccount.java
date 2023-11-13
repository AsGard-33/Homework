package de.ait.homework.homework48;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
        private String accountNumber;
        private String ownerName;
        private double balance;

        public BankAccount(String accountNumber, String ownerName) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.balance = 0.0;
        }

        public void deposit(double  amount) {
            balance += amount;
        }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            logger.error("Попытка снять средства сверх баланса: запрашиваемая сумма - {}, текущий баланс - {}", amount, balance);
            throw new InsufficientFundsException("Недостаточно средств: запрашиваемая сумма - " + amount + ", текущий баланс - " + balance);
        }
        balance -= amount;
        logger.info("Снятие со счета: {} успешно проведено. Текущий баланс: {}", amount, balance);
        }
        public double getBalance() {
            return balance;
        }

    public String getAccountNumber() {
        return accountNumber;
    }

    public class InsufficientFundsException extends RuntimeException {
            public InsufficientFundsException(String message) {
                super(message);
            }
        }
}
