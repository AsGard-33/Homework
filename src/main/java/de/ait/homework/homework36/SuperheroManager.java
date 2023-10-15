package de.ait.homework.homework36;

import java.util.ArrayList;
import java.util.List;

public class SuperheroManager {
    private List<Superhero> superHeroes =new ArrayList<>();
    boolean addSuperhero(Superhero superheroY){
        boolean isContained = false;
        for (Superhero supeRHero : superHeroes) {
            if (supeRHero.getName().equals(superheroY.getName())) {
                isContained = true;
                break;
            }
        }
        if (!isContained) {
            superHeroes.add(superheroY);
            return true;
        }
        return false;

    }
    boolean removeSuperhero(String name){
        Superhero toRemove = null;
        for (Superhero superhero : superHeroes) {
            if (superhero.getName().equals(name)) {
                toRemove = superhero;
                break;
            }
        }
        if (toRemove != null) {
            superHeroes.remove(toRemove);
        }
        return false;
    }
    public Superhero getSuperhero(String name) {
        for (Superhero superhero : superHeroes) {
            if (superhero.getName().equals(name)) {
                return superhero;
            }
        }
        return null;
    }
    List<Superhero> getAllSuperheroes(){
        for (Superhero superhero : superHeroes) {
            System.out.println(superhero);
        }
        return superHeroes;
    }
    void updateSuperhero(String name, Superhero newSuperhero) {
        for (int i = 0; i < superHeroes.size(); i++) {
            if (superHeroes.get(i).getName().equals(name)) {
                superHeroes.set(i, newSuperhero);
                break;
            }
        }
    }
}
