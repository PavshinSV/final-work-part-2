import Entities.*;
import Interfaces.Controller;
import Interfaces.Model;
import Interfaces.View;

import java.util.Scanner;

public class ControllerSimple implements Controller {
    private Model model;
    private View view;
    Scanner sc;

    String menu = "1. Завести новое животное\n2. Список команд животного\n3. Обучить животное новым командам\nВведите номер действия: ";

    public ControllerSimple(Model model, View view) {
        this.model = model;
        this.view = view;
        sc = new Scanner(System.in);
    }


    @Override
    public void runProgramm() {
        while (true) {
            view.showData(menu);
            choice();
        }
    }

    private void choice() {
        try {
            String ch = sc.nextLine();
            switch (ch) {
                case "1" -> addAnimal();
                case "2" -> listOfSkills();
                case "3" -> newSkill();
                default -> view.showData("Неверное значение. Попробуйте еще раз.\n");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void newSkill() {
        int id = getAnimalForOperate();
        if (id==0) {
            return;
        }
        String skill;
        Animal animal = model.getAnimalById(id);
        try {
            view.showData("\n----------------------\nВведите новый навык\n----------------------\n");
            skill=sc.nextLine();
            if (animal instanceof Pack) {
                ((Pack) animal).addHabit(skill);
            } else {
                ((Pet) animal).addSkill(skill);
            }
            model.updateAnimal(id,animal);
        } catch (Exception ex){
            view.showData(ex.getMessage());
        }
    }

    public void listOfSkills() {
        int id = getAnimalForOperate();
        if (id==0) {
            return;
        }
        Animal animal = model.getAnimalById(id);
        view.showData("\n----------------------\nСписок команд/привычек животного\n----------------------\n----------------------\n"+animal.toString()+"\n----------------------\n");
        if (animal instanceof Pack) {
            view.showData(  ((Pack) animal).getHabit()  );
        } else {
            view.showData( ((Pet) animal).getSkill() );
        }
    }

    @Override
    public void addAnimal() {
        Animal animal = null;
        Species species = new Species();
        view.showData("1. Домашнее животное\n2. Вьючное животное\nВыберите тип животного: ");
        String ch = sc.nextLine();
        if (ch.equals("1")) {
            view.showData("1. Собака\n2. Кошка\n3. Хомяк\nВыберите вид животного: ");
            ch = sc.nextLine();
            species = getSpecies();
            switch (ch) {
                case "1" ->
                        animal = new Dog(species.species, species.trait, species.color, species.birthdate, species.name, species.habit);
                case "2" ->
                        animal = new Cat(species.species, species.trait, species.color, species.birthdate, species.name, species.habit);
                case "3" ->
                        animal = new Humster(species.species, species.trait, species.color, species.birthdate, species.name, species.habit);
            }
        } else if (ch.equals("2")) {
            view.showData("1. Лошадь\n2. Верблюд\n3. Осел\nВыберите вид животного: ");
            ch = sc.nextLine();
            species = getSpecies();
            switch (ch) {
                case "1" ->
                        animal = new Horse(species.species, species.trait, species.color, species.birthdate, species.name, species.habit);
                case "2" ->
                        animal = new Camel(species.species, species.trait, species.color, species.birthdate, species.name, species.habit);
                case "3" ->
                        animal = new Donkey(species.species, species.trait, species.color, species.birthdate, species.name, species.habit);
            }
        } else {
            view.showData("Неверный ввод!\n");
            return;
        }
        model.newAnimal(animal);
    }

    private Species getSpecies() {
        Species species = new Species();
        view.showData("Введите имя животного: ");
        species.name = sc.nextLine();
        view.showData("Введите дату рождения животного (ГГГГ-ММ-ДД): ");
        species.birthdate = sc.nextLine();
        view.showData("Введите окрас животного: ");
        species.color = sc.nextLine();
        view.showData("Введите особенность вида животного (через запятую если несколько): ");
        species.species = sc.nextLine();
        view.showData("Введите характерные особенности животного (через запятую если несколько): ");
        species.trait = sc.nextLine();
        view.showData("Введите привычки/команды животного (через запятую если несколько): ");
        species.habit = sc.nextLine();

        return species;
    }

    private void showList() {
        for (Animal animal : model.getAnimals()) {
            if (animal instanceof Pack) {
                view.showData(((Pack) (animal)).toString());
            } else {
                view.showData(((Pet) (animal)).toString());
            }
        }
    }

    private int getAnimalForOperate(){
        if (model.getAnimals().size()==0){
            view.showData("\n----------------------\nСписок пуст\n----------------------\n");
            return 0;
        }
        view.showData("\n----------------------\nСписок всех животных\n----------------------\n");
        showList();
        view.showData("\n----------------------\nВведите 'id' выбранного животного\n----------------------\n");
        int animalId = 0;
        try {
            String str = sc.nextLine();
            animalId = Integer.valueOf(str);
        } catch (Exception ex) {
            view.showData("Введено неверное значение");
        }
        return animalId;
    }
}