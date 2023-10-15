package de.ait.homework.review;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class UserTest {
    private User user;
    @BeforeEach
    void setUp(){
        user =new User("alex",33);
    }

    @Test
    void testGetUserName(){
        assertEquals("alex", user.getUserName());
    }
    @Test
    void testGetUserAge(){
        assertEquals(33,user.getAge());
    }
     @Test
     void testAddFriend() {
         user.addFriend("Misha");
         user.addFriend("Andry");
         List<String> expectedFriends = new ArrayList<>();
         expectedFriends.add("Misha");
         expectedFriends.add("Andry");
         assertEquals(expectedFriends, user.getFriends());
     }
     @Test
     void testRemoveFriend() {
         user.addFriend("Konstantin");
         user.addFriend("Galina");
         user.removeFriend("Konstantin");
         ArrayList<String> expectedFriends = new ArrayList<>();
         expectedFriends.add("Galina");
         assertEquals(expectedFriends, user.getFriends());
     }
}
