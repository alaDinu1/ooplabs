package com.Dinu.lab7;

public class Square extends Figure {
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    public String getName() {
        return "Square";
    }

    double getPerimeter() {
        return 4 * a;
    }

    double getArea() {
        return a * a;
    }
}