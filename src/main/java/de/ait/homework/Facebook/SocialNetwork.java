package de.ait.homework.Facebook;

import java.util.ArrayList;
import java.util.HashMap;

    public class SocialNetwork {
        private HashMap<Integer, User> users = new HashMap<>();
        private HashMap<Integer, Group> groups = new HashMap<>();
        private ArrayList<Post> posts = new ArrayList<>();

        public User registerUser(int id, String name) {
            User newUser = new User(id, name);
            users.put(id, newUser);
            return newUser;
        }

        public Group createGroup(int id, String name) {
            Group newGroup = new Group(id, name);
            groups.put(id, newGroup);
            return newGroup;
        }

        public Post createPost(User author, String content) {
            Post newPost = new Post(posts.size() + 1, content, author);
            posts.add(newPost);
            return newPost;
        }

        public ArrayList<User> getFriendsOfUser(User user) {
            return user.getFriends();
        }

        public ArrayList<Group> getGroupsOfUser(User user) {
            ArrayList<Group> userGroups = new ArrayList<>();
            for (Group group : groups.values()) {
                if (group.getMembers().contains(user)) {
                    userGroups.add(group);
                }
            }
            return userGroups;
        }
    }
