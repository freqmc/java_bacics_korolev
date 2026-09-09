package org.example;
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.5, 1.5, 6.25);
        Circle circle2 = new Circle();
        System.out.println(circle1.findArea(circle1.d));
        System.out.println(circle2.findArea(circle2.d));
    }
}
