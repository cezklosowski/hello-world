package sda.lekcja05.zadania_d3;

public class Rectangle extends Figures {
    private double width;
    private double height;

    public Rectangle(double width, double hight) {
        this.width = width;
        this.height = hight;
    }

    public double getArea(){
        return width * height;
    }
}
