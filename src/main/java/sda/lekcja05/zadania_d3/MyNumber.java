package sda.lekcja05.zadania_d3;

public class MyNumber {
    private double real;

    public MyNumber() {
    }

    public MyNumber(double number) {
        this.real = number;
    }

    public double getNumber() {
        return real;
    }

    public void setNumber(double number) {
        this.real = number;
    }

    public double getImaginary(){
        return 0;
    }

    @Override
    public String toString() {
        return Double.toString(real);
    }
}
