package oop.ex;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("높이: ");
        height = scanner.nextInt();
        scanner.nextLine();
        System.out.print("길이: ");
        width = scanner.nextInt();
    }
    int calculateArea() {
        return width * height;
    }
    /*
    void calculateArea() {
        int area = width * height;
        System.out.println("넓이: " + area);
     */

    void calculatePerimeter() {
        int perimeter = 2 * (width + height);
        System.out.println("둘레: " + perimeter);
    }
    void isSquare() {
        boolean square = (width == height);
        System.out.println("정사각형 여부: " + square);
    }
}
