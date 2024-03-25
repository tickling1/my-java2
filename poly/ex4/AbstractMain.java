package poly.ex4;

public class AbstractMain {

    public static void main(String[] args) {

        AbstractAnimal[] animals = {new Dog(), new Cat(), new Caw()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }
    }
    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        abstractAnimal.sound();
        abstractAnimal.move();
    }
}
