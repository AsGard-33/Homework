package de.ait.homework.homework40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarTest {
    Bar bar;
    Drink drink;

    @BeforeEach
    void setUp() {
        bar = new Bar();
        drink =new Drink("Fanta","Alcohol frei",500);

    }
    @Test
    void testDrinkCreation(){
        assertEquals("Fanta", drink.getName());
        assertEquals("Alcohol frei", drink.getType());
        assertEquals(500, drink.getVolume());

    }
    @Test
    void testAddDrink(){
        bar.addDrink("1",drink);
        assertEquals(drink,bar.getDrink("1"));
    }
    @Test
    void testAddDrinkWithExistingId(){
        bar.addDrink("1",drink);
        Drink newDrink = new Drink("Hennessy", "kognac", 500);
        bar.addDrink("1",newDrink);
        assertEquals(newDrink,bar.getDrink("1"));
    }
    @Test
    void testGetDrinkById(){
        bar.addDrink("1",drink);
        assertEquals(drink ,bar.getDrink("1"));
    }
    @Test
    void testGetDrinkByNonExistingId(){
        assertEquals(null, bar.getDrink("2"));
    }
    @Test
    public void testDrinkToString() {

        String expectedString = "Drink{name='Fanta', type='Alcohol frei', volume=500.0}";
        assertEquals(expectedString, drink.toString());
    }
}