package pet_registry;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal{

    private String name;
    private String animalName;
    private List<String> commands = new ArrayList<>();

    public Cat(String name) {
        this.name = name;
        this.animalName = this.getClass().toString().toLowerCase();
        Animal.setAnimals(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    @Override
    public void addCommand(String command) {
        commands.add(command);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", animalName='" + animalName + '\'' +
                ", commands=" + commands +
                '}';
    }
}
