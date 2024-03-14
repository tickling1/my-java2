package static2.ex;

public class Car {
    private String carName;
    private static int totalCars = 0;
    private static String[] cars = new String[3];

    Car(String carName) {
        cars[totalCars] = carName;
        totalCars++;
    }

    public static void showTotalCars() {
        for (String c : cars) {
            System.out.println("차량 구입, 이름: " + c);
        }
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
