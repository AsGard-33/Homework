package de.ait.homework.homework35two;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private List<Contact> contacts = new ArrayList<>();

    public boolean addContact(Contact contact) {

        if (contact == null || findContactByName(contact.getName()) != null) {
            return false;
        }
        contacts.add(contact);
        return true;
    }
    public boolean deleteContact(String name) {
        Contact contact = findContactByName(name);
        if (contact == null) {
            return false;
        }
        contacts.remove(contact);
        return true;
    }
    public Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }
}
