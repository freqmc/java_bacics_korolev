package org.example;
import java.lang.Math;

public class Circle extends Figure{
    public Circle(double X, double Y, double R){
        setX(X);
        setY(Y);
        setR(R);
    }

    @Override
    public double find_area(){
        return Math.PI * Math.pow(getR(), 2);
    }
}
