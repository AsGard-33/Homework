package de.ait.homework.homework43;

import de.ait.homework.Logging.Logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BankAccount {
    private static final Logger logger = LogManager.getLogger(BankAccount.class);
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount){
        //Увеличьте balance на значение amount.
        //Логируйте операцию на уровне INFO, указывая владельца аккаунта и сумму пополнения.
        balance += amount;
        logger.info("{} deposited {}. Current balance: {}", owner, amount, balance);
    }
    public void withdraw(double amount){
        //Проверьте, достаточно ли средств на аккаунте. Если не достаточно, залогируйте это как ERROR, указывая владельца аккаунта и требуемую сумму.
        //Если средств достаточно, уменьшите balance на amount и логируйте операцию на уровне INFO.
        if (amount > balance) {
            logger.error("Insufficient funds for {}. Required: {}, Available: {}", owner, amount, balance);
            return;
        }
        balance -= amount;
        logger.info("{} withdrew {}. Current balance: {}", owner, amount, balance);
    }

    public double checkBalance() {
        //Верните текущий баланс.
        //Логируйте запрос баланса на уровне DEBUG, указывая владельца аккаунта.
        logger.debug("{} checked balance. Current balance: {}", owner, balance);
        return balance;
    }

}
