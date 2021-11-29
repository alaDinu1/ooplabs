package com.Dinu.lab8;

public class Main {
    public static void main(String[] args) {

        Cube cube = new Cube (6);
        Sphere sphere = new Sphere (2);
        Parallelipiped parallelepiped = new Parallelipiped (1,25,16);

        GeometricBody[] list = new GeometricBody[3];
        list[0] = cube;
        list[1] = sphere;
        list[2] = parallelepiped;

        System.out.println(list[0].getName() + "|" + " Surface = " + list[0].getSurface()+ " Volume =  " + list[0].getVolume() + "\n" +
                list[1].getName()+ "|" + " Surface = " + list[1].getSurface() + " Volume = " + list[1].getVolume() + "\n" +
                list[2].getName()+ "|" + " Surface = " + list[2].getSurface() + " Volume =  " + list[2].getVolume() + "\n");

        System.out.println("Task2" + "\n");
        GeometricBodyController x = new GeometricBodyController();
        System.out.println("Biggest surface| "+ x.biggestSurf(list).getName() + " with: " + x.biggestSurf(list).getSurface() + "\n" +
                "Biggest Volume| " + x.biggestVolume(list).getName() + " with: " + x.biggestVolume(list).getVolume());
    }
}