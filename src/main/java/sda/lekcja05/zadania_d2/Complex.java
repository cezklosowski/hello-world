package sda.lekcja05.zadania_d2;

public class Complex {
    private int real;
    private int imaginary;
    public static int counter = 0;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        counter++;
    }

    public Complex(int real) {
        this.real = real;
        counter++;
    }

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
        counter++;
    }

    public static Complex addTwoNumbers(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imaginary + b.imaginary);
    }

    public void add(Complex a) {
        this.real += a.real;
        this.imaginary += a.imaginary;
    }

    public static Complex addThreeNumbers(Complex a, Complex b, Complex c) {
        return new Complex(a.real + b.real + c.real, a.imaginary + b.imaginary + c.imaginary);
    }

    public static Complex addNumbers(Complex... a) {
        Complex score = new Complex();
        for (int i = 0; i < a.length; i++) {
            score.real += a[i].real;
            score.imaginary += a[i].imaginary;
        }
        return score;
    }

    public static int howMuchNumbers(){
        return counter;
    }




    /*
    public void print(){
        if (imaginary == 0){
            System.out.println(real);
        }
        if (imaginary > 0){
            System.out.println(real + " + " + imaginary + "*i");
        }
        if (imaginary < 0){
            System.out.println(real + " - " + Math.abs(imaginary) + "*i");
        }
    }
    */

    /*
    public boolean isEqualTo(Complex number){
        if (this.real == number.real && this.imaginary == number.imaginary){
            return true;
        } else {
            return false;
        }
    }
    */


    @Override
    public String toString() {
        String score = "";
        if (imaginary == 0) {
            score = "" + real;
        }
        if (imaginary > 0) {
            score = real + " + " + imaginary + "*i";
        }
        if (imaginary < 0) {
            score = real + " - " + Math.abs(imaginary) + "*i";
        }
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return real == complex.real && imaginary == complex.imaginary;
    }

}
