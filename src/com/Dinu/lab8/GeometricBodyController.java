package com.Dinu.lab8;

public class GeometricBodyController {

    public GeometricBody biggestSurf (GeometricBody[] objects) {

        double temp = 0;
        int n = 0;
        for (int i=0; i<objects.length; i++) {
            if (objects[i]!=null && objects[i].getSurface()>temp) {
                temp=objects[i].getSurface();
                n=i;
            }
        }
        return objects[n];
    }

    public GeometricBody biggestVolume (GeometricBody[] objects) {

        double temp=0;
        int n=0;
        for (int i=0;i<objects.length;i++){
            if (objects[i]!=null && objects[i].getVolume()>temp) {
                temp=objects[i].getVolume();
                n=i;
            }
        }
        return objects[n];
    }
}
