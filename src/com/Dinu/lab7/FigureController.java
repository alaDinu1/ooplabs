package com.Dinu.lab7;

public class FigureController {

    public Figure biggestArea (Figure[] objects) {
        double temp = 0;
        int object = 0;
        for (int i=0; i<objects.length; i++) {
            if (objects[i]!=null && objects[i].getArea()>temp) {
                temp=objects[i].getArea();
                object=i;
            }
        }
        return objects[object];
    }

    public Figure biggestPerimeter (Figure[] objects) {
        double temp=0;
        int k=0;
        for (int i=0;i<objects.length;i++){
            if (objects[i]!=null && objects[i].getPerimeter()>temp) {
                temp=objects[i].getPerimeter();
                k=i;
            }
        }

        return objects[k];
    }
}