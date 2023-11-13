package de.ait.homework.homework48;

import java.util.Map;

public class AccountService {
    private Map<String, User> userAccounts;

    public AccountService(Map<String, User> userAccounts) {
        this.userAccounts = userAccounts;
    }

    public BankAccount getAccountForUser(String username) {
        User user = userAccounts.get(username);
        return (user != null) ? user.getAccount() : null;
    }
}
