package com.Dinu.lab1.Task1;

public class Task1{
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        monitor1.color = "black";
        monitor1.dimensions = 19;
        monitor1.resolution = "1280 x 1024";

        Monitor monitor2 = new Monitor();
        monitor2.color = "grey";
        monitor2.dimensions = 22;
        monitor2.resolution = "1680 x 1050";

        System.out.println("The first monitor specification are: " + "(color) " + monitor1.color + " | (dimension) " + monitor1.dimensions + " | (resolution) " + monitor1.resolution);
        System.out.println("The second monitor specification are: " + "(color) " + monitor2.color + " | (dimension) " + monitor2.dimensions + " | (resolution) " + monitor2.resolution);




    }
}
