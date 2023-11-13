package de.ait.homework.homework48;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationServiceTest {
    private AuthenticationService authService;
    private AccountService accountService;

    @BeforeEach
    public void setUp() {
        //  Создаем карту пользователей для тестирования
        Map<String, User> testUsers = new HashMap<>();
        testUsers.put("user1", new User("user1", "password1", new BankAccount("acc123", "user1")));
        testUsers.put("user2", new User("user2", "password2", new BankAccount("acc456", "user2")));

        // Инициализация AccountService с тестовыми пользователями
        accountService = new AccountService(testUsers);

        // Инициализация AuthenticationService с AccountService
        authService = new AuthenticationService(accountService);
    }

    @Test
    public void testSuccessfulAuthentication() {
        assertDoesNotThrow(() -> authService.authenticate("user1", "password1"));
    }

    @Test
    public void testFailedAuthentication() {
        assertThrows(AuthenticationService.AuthenticationException.class,
                () -> authService.authenticate("user1", "wrongPassword"));
    }

    // Дополнительные тесты...
}