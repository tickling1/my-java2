package poly.car1;

public class Driver {
    private Car car; // 클래스 의존 관계. 클래스 상에서 어떤 클래스 를 알고 있는지 뜻한다.

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
