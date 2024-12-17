package org.derryfield.util;

public class Geometry{
    public static double calcVolSphere(double r){
        double volume = 0.75 * Math.PI * r * r * r;
        return volume;
    }

    public static double calcSurfSphere(double r){
        double surfarea = 4 * Math.PI * r * r;
        return surfarea;
    }
}