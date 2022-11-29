package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Прямоугольник:");
        Rectangle ABCD = new Rectangle();
        ABCD.rectangle(-4,5);
        System.out.println(ABCD.square());
        System.out.println(ABCD.perimetr());

        System.out.println("Треугольник:");
        Triangle ABC = new Triangle();
        ABC.triangle(2,2,3);
        System.out.println(ABC.square());
        System.out.println(ABC.perimetr());

        System.out.println("Круг:");
        Circle S = new Circle();
        S.circle(10);
        System.out.println(S.square());
        System.out.println(S.perimetr());
    }
}