package com.Dinu.lab8;

public class Cube extends GeometricBody {
    private final double a;

    public Cube (double a) {
        this.a = a;
    }

    public String getName() {
        return "Cube";
    }

    double getSurface() {
        return 6 * a * a;
    }

    double getVolume() {
        return a * a * a;
    }
}