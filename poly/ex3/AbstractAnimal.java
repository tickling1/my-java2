package poly.ex3;

public abstract class AbstractAnimal { // 추상 클래스를 선언

    public abstract void sound(); // 추상 메서드를 선언, 자식 메서드에서 무조건 오버라이딩 해야함

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
