package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
        //인스턴스 생성 불가
        //InterfaceAnimal interface1 = new InterfaceAnimal(); 
            
        InterfaceAnimal[] interfaceAnimals = {new Dog(), new Cat(), new Caw()};

        for (InterfaceAnimal interfaceAnimal : interfaceAnimals) {
            soundAnimal(interfaceAnimal);
        }
    }
    private static void soundAnimal(InterfaceAnimal interfaceAnimal) {
        interfaceAnimal.sound();
        interfaceAnimal.move();
    }
}
