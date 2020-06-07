package sda.lekcja05.zadania_d3;

public class Circle extends Figures {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
