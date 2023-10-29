package de.ait.homework.Facebook;

import java.util.HashSet;
import java.util.Objects;

public class Group {
    private int id;
    private String name;
    private HashSet<User> members = new HashSet<>();

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addMember(User user) {
        members.add(user);
    }

    public HashSet<User> getMembers() {
        return members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id == group.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
