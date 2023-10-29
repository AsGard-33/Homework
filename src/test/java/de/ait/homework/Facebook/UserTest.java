package de.ait.homework.Facebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = new User(1, "Masha");
    }
    @Test
    void addFriend() {

        User user1 = new User(2, "Andrej");
        user.addFriend(user1);
        assertTrue(user.getFriends().contains(user1));
    }
    @Test
    void testEquals() {
        User user1 = new User(1, "Masha");
        assertEquals(user, user1);
    }
    @Test
    void testHashCode() {
        User user1 = new User(1, "Masha");
        assertEquals(user1.hashCode(), user1.hashCode());
    }
}