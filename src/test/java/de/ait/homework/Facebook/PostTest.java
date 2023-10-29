package de.ait.homework.Facebook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {
    User user;
    Post post;
    Post post1;

    @Test
    void testEquals() {
        user = new User(1, "Masha");
        post = new Post(1, "Hello!", user);
        post1 = new Post(1, "Hello!", user);
        assertEquals(post, post1);
    }

    @Test
    void testHashCode() {
        user = new User(1, "Masha");
        post = new Post(1, "Hello!", user);
        post1 = new Post(1, "Hello!", user);

        assertEquals(post.hashCode(), post1.hashCode());

    }
}