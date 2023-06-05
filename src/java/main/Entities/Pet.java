package Entities;

public abstract class Pet extends Animal {
    private String name;
    private String skill;

    public Pet(String species, String trait, String color, String birthdate, String name, String skill) {
        super(species, trait, color, birthdate);
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return this.name;
    }

    public String getSkill() {
        return this.skill;
    }

    public void addSkill(String newSkill) {
        if (this.skill.length() > 0) {
            this.skill += ", " + newSkill;
        } else {
            this.skill = newSkill;
        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + super.getId() + '\'' +
                "name= " + name + '\'' +
                "species=" + super.getSpecies() + '\'' +
                "birthdate=" + super.getBirthdate() + '\'' +
                "color=" + super.getColor() + '\'' +
                "trait=" + super.getTrait() + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}