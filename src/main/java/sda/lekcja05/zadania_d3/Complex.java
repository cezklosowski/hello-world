package sda.lekcja05.zadania_d3;

public class Complex extends MyNumber{

    private double imaginary;

    public Complex(double real, double imaginary) {
        super(real);
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        String score = "";
        if (imaginary == 0) {
            score = "" + super.getNumber();
        }
        if (imaginary > 0) {
            score = super.getNumber() + " + " + imaginary + "*i";
        }
        if (imaginary < 0) {
            score = super.getNumber() + " - " + Math.abs(imaginary) + "*i";
        }
        return score;
    }
}
