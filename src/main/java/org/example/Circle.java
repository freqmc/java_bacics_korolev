package org.example;
import java.util.Scanner;
import java.lang.Math;

public class Circle{
    double x,y,d;
    Scanner scanner = new Scanner(System.in);
    public Circle(double x, double y, double d){
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public Circle(){
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        d = scanner.nextDouble();
    }

    public double findArea(double d){
        return Math.PI * Math.pow(d/2, 2);
    }
}
