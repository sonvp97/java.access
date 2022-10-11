package com.codegym;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){
    }
     public Circle(double r){
        this.radius = r;
    }

     protected double getRadius(){
        return this.radius;
    }
    protected double getArea(){
        return 3.14*this.radius*this.radius;
    }
}
