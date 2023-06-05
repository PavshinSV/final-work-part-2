package Entities;

public abstract class Animal {
    private static int counter;
    private String species;
    private String trait;
    private String color;
    private String birthdate;
    private int id;

    public Animal(String species, String trait, String color, String birthdate) {
        this.species = species;
        this.trait = trait;
        this.color = color;
        this.birthdate = birthdate;
        this.id = ++counter;
    }

    public String getSpecies() {
        return this.species;
    }

    public String getTrait() {
        return this.trait;
    }

    public String getColor() {
        return this.color;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public int getId() {
        return this.id;
    }
}