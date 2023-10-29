package de.ait.homework.Facebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {

    Group group;
    User user;

    @Test
    void addMember() {
        group = new Group(1, "Group 1");
        user = new User(1, "Masha");
        group.addMember(user);
        assertTrue(group.getMembers().contains(user));
    }
    @Test
    void testEquals() {
        Group group1 = new Group(1, "Group 1");
        Group group2 = new Group(1, "Group 1");
        assertEquals(group1, group2);
    }
    @Test
    void testHashCode() {
        Group group1 = new Group(1, "Group 1");
        Group group2 = new Group(1, "Group 1");
        assertEquals(group1.hashCode(), group2.hashCode());

    }

    public Group getGroup() {
        return group;
    }

    public User getUser() {
        return user;
    }
}