package de.ait.homework.homework35two;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhonebookTest {
    private Phonebook phonebook;
    @BeforeEach
    public void setUp(){
        phonebook = new Phonebook();

    }
    @Test
    public void  testAddValidContact(){
        Contact aleksey = new Contact("Aleksey","+49157000333");
        assertTrue(phonebook.addContact(aleksey));
        assertEquals(aleksey,phonebook.findContactByName("Aleksey"));
    }
    @Test
    public void testAddDuplicateContact(){
        Contact andrey1 = new Contact("Andrey", "+49157000111");
        assertEquals(true,phonebook.addContact(andrey1));
        Contact andrey2 = new Contact("Andrey", "+49157000444");
        assertFalse(phonebook.addContact(andrey2));
    }
    @Test
    public void testAddNullContact(){
        assertFalse(phonebook.addContact(null));
    }
    @Test
    void testDeleteExistingContact(){
        Contact vasilij = new Contact("Vasiliy", "+49157000222");
        phonebook.addContact(vasilij);
        assertTrue( phonebook.deleteContact("Vasiliy"));
    }
    @Test
    void testDeleteNonexistentContact(){
        assertFalse( phonebook.deleteContact("Margarita"));
    }
    @Test
    void testFindExistingContact(){
        Contact alisa = new Contact("Alisa", "+49157000555");
        phonebook.addContact(alisa);
        assertEquals(alisa,phonebook.findContactByName("Alisa"));
    }
    @Test
    void testFindNonexistentContact(){
        assertNull(phonebook.findContactByName("Natasha"));
    }
}
