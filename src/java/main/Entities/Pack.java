package Entities;

public class Pack extends Animal {
    private String name;
    private String habit;

    public Pack(String species, String trait, String color, String birthdate, String name, String habit) {
        super(species, trait, color, birthdate);
        this.name = name;
        this.habit = habit;
    }

    public String getName() {
        return this.name;
    }

    public String getHabit() {
        return this.habit;
    }

    public void addHabit(String newHabit) {
        if (this.habit.length() > 0) {
            this.habit += ", " + newHabit;
        } else {
            this.habit = newHabit;
        }
    }
}
