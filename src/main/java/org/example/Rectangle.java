package org.example;

public class Rectangle extends Figure{
    public Rectangle(double W, double L){
        setWidth(W);
        setLength(L);
    }
    @Override
    public double find_area(){
        return getWidth()*getLength();
    }
}
