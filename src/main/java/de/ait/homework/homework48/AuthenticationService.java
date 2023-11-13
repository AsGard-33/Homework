package de.ait.homework.homework48;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationService.class);
    private Map<String, User> users;
    private AccountService accountService;

    public AuthenticationService(AccountService accountService) {
        this.accountService = accountService;
        users = new HashMap<>();
        users.put("user1", new User("user1", "password1", new BankAccount("acc123", "user1")));
        users.put("user2", new User("user2", "password2", new BankAccount("acc456", "user2")));


    }

    public void authenticate(String username, String password) throws AuthenticationException {
        User user = users.get(username);
        if (!checkCredentials(username, password)) {
            logger.error("Ошибка аутентификации для пользователя: {}", username);
            throw new AuthenticationException("Неверные учетные данные для пользователя: " + username);
        }
        logger.info("Пользователь {} выполнил вход в систему", user.getUsername());

        // Получение и использование банковского счета после аутентификации
        BankAccount userAccount = accountService.getAccountForUser(username);
        if (userAccount != null) {
            // Здесь можно взаимодействовать с банковским счетом
            logger.info("Банковский счет для пользователя {}: {}", username, userAccount.getAccountNumber());
            logger.info("Текущий баланс: {}", userAccount.getBalance());
        }
    }

    private boolean checkCredentials(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }

    public static class AuthenticationException extends RuntimeException {
        public AuthenticationException(String message) {
            super(message);
        }
    }
}