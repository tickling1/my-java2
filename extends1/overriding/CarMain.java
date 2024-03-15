package extends1.overriding;
import extends1.overriding.ElectricCar;
import extends1.overriding.GasCar;
import extends1.overriding.HydrogenCar;

public class CarMain {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
