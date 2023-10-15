package de.ait.homework.homework36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SuperHeroManagerTest {
    private SuperheroManager superheroManager;
    @BeforeEach
    void setUp(){
        superheroManager = new SuperheroManager();

    }
    @Test
    void testAddSuperHeroTrue(){
        Superhero superhero1 = new Superhero("Batman", 9, 40);
        superheroManager.addSuperhero(superhero1);
        assertEquals(superhero1, superheroManager.getSuperhero("Batman"));
    }
    @Test
    void testAddSuperHeroFalse() {
        Superhero superhero1 = new Superhero("Batman", 9, 40);
        Superhero superhero2 = new Superhero("Batman", 9, 40);
        assertTrue(superheroManager.addSuperhero(superhero1));
        assertFalse(superheroManager.addSuperhero(superhero2));

    }



    @Test
    void testRemoveSuperhero() {
        Superhero superhero = new Superhero("Superman", 10, 30);
        superheroManager.addSuperhero(superhero);
        superheroManager.removeSuperhero("Superman");
        assertNull(superheroManager.getSuperhero("Superman"));
    }
    @Test
    void testRemoveNonExistentSuperhero() {
        assertFalse(superheroManager.removeSuperhero("Spiderman"));
    }
    @Test
    void testGetSuperhero() {

        Superhero superhero = new Superhero("Superman", 10, 30);
        superheroManager.addSuperhero(superhero);
        assertEquals(superhero, superheroManager.getSuperhero("Superman"));
    }

    @Test
    void testGetAllSuperheroes(){
        Superhero superhero1 = new Superhero("Batman", 9, 40);
        Superhero superhero2 = new Superhero("Superman", 10, 30);
        superheroManager.addSuperhero(superhero1);
        superheroManager.addSuperhero(superhero2);
        List<Superhero> allSuperheroes = superheroManager.getAllSuperheroes();
        assertTrue(allSuperheroes.contains(superhero1));
        assertTrue(allSuperheroes.contains(superhero2));

        superheroManager.getAllSuperheroes();
    }
    @Test
    void testUpdateSuperhero() {
        Superhero superhero1 = new Superhero("Batman", 9, 40);
        superheroManager.addSuperhero(superhero1);

        Superhero newSuperhero = new Superhero("Batman", 10, 45);
        superheroManager.updateSuperhero("Batman", newSuperhero);

        assertEquals(newSuperhero, superheroManager.getSuperhero("Batman"));
    }
}
