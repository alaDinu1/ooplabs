package com.Dinu.lab7;

public class Triangle extends Figure {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getName() {
        return "Triangle";

    }
    double getPerimeter() {
        return a + b + c;
    }


    double getArea() {
        double p;
        p = (a+b+c)/2;
        return Math.sqrt (p * (p-a) * (p-b) * (p-c));
    }
}