package de.ait.homework.homework36;

public class Superhero {
    private String name;
    private int power;
    private int age;

    public Superhero(String name, int power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", age=" + age +
                '}';
    }

}
