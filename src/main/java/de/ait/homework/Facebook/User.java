package de.ait.homework.Facebook;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private int id;
    private String name;
    private ArrayList<User> friends = new ArrayList<>();

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addFriend(User friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
            friend.addFriend(this); // Добавить себя в список друзей друга
        }
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
