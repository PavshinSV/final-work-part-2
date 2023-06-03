import javax.swing.text.View;

import Entities.Animal;
import Interfaces.Controller;
import Interfaces.Model;

public class ControllerSimple implements Controller {
    private Model model;
    private View view;

    public ControllerSimple(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void runProgramm() {

    }

    public void addAnimal() {

    }

    public void addCommand(Animal animal) {

    }

    public String showCommands(Animal animal) {
        return "";
    }
}