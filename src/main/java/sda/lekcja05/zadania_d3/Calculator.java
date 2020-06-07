package sda.lekcja05.zadania_d3;

public class Calculator {



    public static Complex add(MyNumber a, MyNumber b) {
        return new Complex(a.getNumber() + b.getNumber(), a.getImaginary() + b.getImaginary());
    }
}
