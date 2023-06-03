package Interfaces;

import Entities.Animal;

public interface Controller {
    void runProgramm();

    void addAnimal();

    String showCommands(Animal animal);

    void addCommand(Animal animal);
}