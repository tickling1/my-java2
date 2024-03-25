package poly.ex3;

public class AbstractMain {

    public static void main(String[] args) {
        //추상 클래스 생성 불가
        //AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        AbstractAnimal[] animals = {dog, cat, caw};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }
    }
    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        abstractAnimal.sound();
        abstractAnimal.move();
    }
}
