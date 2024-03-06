package oop.ex;

public class RectangleProceduralMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.input();
        int area = rectangle.calculateArea();
        // rectangle.calculateArea();
        System.out.println("넓이: " + area);
        rectangle.calculatePerimeter();
        rectangle.isSquare();
    }
}
