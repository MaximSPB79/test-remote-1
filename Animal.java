package pet_registry;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {


    private static final List<Animal> animals = new ArrayList<>();

    public void addCommand(String command) {

    }

    public static void setAnimals(Animal animal){
        animals.add(animal);
    }
}
