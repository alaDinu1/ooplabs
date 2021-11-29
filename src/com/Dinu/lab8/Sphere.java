package com.Dinu.lab8;


public class Sphere extends GeometricBody {
    private final double radius;

    public Sphere (double r) {
        this.radius = r;
    }
    public String getName() {
        return "Sphere";
    }

    double getSurface() {
        return 4 * (Math.PI) * radius * radius;
    }

    double getVolume() {
        return 4 * ((Math.PI)* radius*radius*radius)/3;
    }


}