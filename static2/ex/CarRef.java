package static2.ex;

public class CarRef {
    private String name;
    private static int totalCars = 0;
    CarRef(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
