import Animals.*;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Cow cow = new Cow();
        zoo.addAnimal(cow);

        Sheep sheep = new Sheep();
        zoo.addAnimal(sheep);

        Horse horse = new Horse();
        zoo.addAnimal(horse);

        Alligator alligator = new Alligator();
        zoo.addAnimal(alligator);

        Shrike shrike = new Shrike();
        zoo.addAnimal(shrike);

        zoo.printAnimals();
    }
}