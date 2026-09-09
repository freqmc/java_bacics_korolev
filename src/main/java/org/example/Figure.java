package org.example;

import java.util.ArrayList;

public class Figure {
    private double x,y,r,width,length;
    public double getX(){return x;}
    public void setX(double x){ this.x = x; }
    public double getY(){return y;}
    public void setY(double y){ this.y = y; }
    public double getR(){ return r; }
    public void setR(double r){
        if (r < 0) {
            System.out.println("радиус должен быть > 0!");
        } else {
            this.r = r;
        }
    }
    public double getWidth(){return width;}
    public void setWidth(double width){
        if (width < 0) {
            System.out.println("ширина должна быть > 0!");
        } else {
            this.width = width;
        }
    }
    public double getLength(){return length;}
    public void setLength(double length){
        if (length < 0) {
            System.out.println("длина должна быть > 0!");
        } else {
            this.length = length;
        }
    }
    public double find_area(){ return 0; }
    public void shape_stat(ArrayList<Figure> arr){
        int circle_num = 0;
        int rect_num = 0;
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) instanceof Circle){
                circle_num++;
            } else {
                rect_num++;
            }
        }
        System.out.println("кругов - " + circle_num);
        System.out.println("прямоугольников - " + rect_num);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Circle) {
                System.out.println("S круга = " + arr.get(i).find_area());
            } else {
                System.out.println("S прямоугольника = " + arr.get(i).find_area());
            }
        }
        }
    }
