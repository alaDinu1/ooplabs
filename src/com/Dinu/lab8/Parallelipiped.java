package com.Dinu.lab8;

public class Parallelipiped extends GeometricBody {
    private final double length;
    private final double width;
    private final double depth;

    public Parallelipiped(double length, double width, double depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;


    }
    public String getName() {
        return "Parallelipiped";
    }

    double getSurface() {
        return 2 * (length*width + length*depth + width*depth);
    }

    double getVolume() {
        return length * width * depth;
    }

}

