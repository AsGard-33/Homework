package de.ait.homework.Facebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocialNetworkTest {
    private SocialNetwork socialNetwork;

    @BeforeEach
    void setUp() {
        socialNetwork = new SocialNetwork();
    }

    @Test
    void registerUser() {
        User alice = socialNetwork.registerUser(1, "Masha");

        assertEquals(1, alice.getId());
        assertEquals("Masha", alice.getName());
    }

    @Test
    void createGroup() {
        Group group1 = socialNetwork.createGroup(1, "Group 1");

        assertEquals(1, group1.getId());
        assertEquals("Group 1", group1.getName());
    }

    @Test
    void createPost() {
        User alice = socialNetwork.registerUser(1, "Alice");
        Post post1 = socialNetwork.createPost(alice, "Hello world!");

        assertEquals(1, post1.getId());
        assertEquals("Hello world!", post1.getContent());
        assertEquals(alice, post1.getAuthor());
    }

    @Test
    void getFriendsOfUser() {
        User alice = socialNetwork.registerUser(1, "Masha");
        User bob = socialNetwork.registerUser(2, "Andrej");
        alice.addFriend(bob);
        assertTrue(socialNetwork.getFriendsOfUser(alice).contains(bob));
    }

    @Test
    void getGroupsOfUser() {
        User alice = socialNetwork.registerUser(1, "Alice");
        Group group1 = socialNetwork.createGroup(1, "Group 1");
        group1.addMember(alice);
        assertTrue(socialNetwork.getGroupsOfUser(alice).contains(group1));
    }
}