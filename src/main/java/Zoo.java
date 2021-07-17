import Animals.BaseAnimal;

import java.util.ArrayList;

public class Zoo {
    ArrayList<String> animals = new ArrayList<>();

    public Zoo(){

    }

    public void addAnimal(BaseAnimal animal){
        animals.add(animal.getName());
    }

    public void printAnimals() {
        System.out.println(animals);
    }
}