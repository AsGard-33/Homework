package de.ait.homework.homework40;

import java.util.HashMap;
import java.util.Map;

public class Bar {
    private Map<String, Drink > drinks = new HashMap<>();
    void addDrink(String id, Drink drink){
        drinks.put(id, drink);
    }
    public Drink getDrink(String id){
        return drinks.get(id);
    }

}
