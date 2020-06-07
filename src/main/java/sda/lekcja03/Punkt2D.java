package sda.lekcja03;

import static java.lang.Math.*;


public class Punkt2D {

    public double x;
    public double y;

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double odleglosc(Punkt2D p1, Punkt2D p2){
        return sqrt((pow(p1.x-p2.x,2)+pow(p1.y-p2.y,2)));
    }






}
