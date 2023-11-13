package de.ait.homework.homework48;

public class User {
    private String username;
    private String password;
    private BankAccount account;

    public User(String username, String password,BankAccount account) {
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public BankAccount getAccount() {
        return account;
    }

}
