package com.Dinu.lab7;

public class Rectangle extends Figure {
    private final double A;
    private final double B;

    public Rectangle (double A,double B) {
        this.A = A;
        this.B = B;
    }
    public String getName() {
        return "Rectangle";
    }

    double getPerimeter() {
        return 2 * (A+B);
    }

    double getArea() {
        return A * B;
    }

}