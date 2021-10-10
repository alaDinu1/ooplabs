package com.Dinu.lab2.tasks;

//Task1
public class Boxes {
    private final int width;
    private final int height;
    private final int depth;
    public float area;
    public float volume;

    Boxes()
    {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    Boxes(int a)
    {
        this.height = a;
        this.width = a;
        this.depth = a;
    }

    Boxes(int height, int width, int depth)
    {
        this.height = height;
        this.width = width;
        this.depth = depth;

        // Task 3
        area = 2 * (height * width) + 2 * (height * depth) + 2 * (depth * width);
        volume = height * width * depth;


    }
}