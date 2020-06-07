package sda.lekcja04_3;
/*
Napisać klasę narzędziową Kalkulator która będzie metody:
- add(int i, int k) - dodawania i + k;
- substract(int j, int k) - odejmowania i od k
- pow(int i, int k) - i do potegi
- multiply(int i, int k) - i razy k
- divide(int i, int k) - dzielenie całkowice i przez każdej
UWAGA 1 ponieważ jest to klasa narzędziowa która nie przechowuje żadnych wartości w polach, więc wszystkie metody mogą być statyczne
UWAGA 2 kalkulator ma operować tylko na liczbach całkowitych.
UWAGA 3 !!!!!!! przy rozwiązaniu zadania WOLNO korzystać TYLKO ! z operatorów i++, ++i, i--, ++i - NIE WOLNO KORZYSTAĆ Z innych operatorów arytmetycznych
tj. +, -, *, /, %
 */

public class Main {
    public static void main(String[] args) {

        int a = 4;
        int b = 3;
        System.out.println("Dodawanie: " + a + " + " + b + " = " + Calculator.add(a,b));
        System.out.println("Odejmowanie: " + a + " - " + b + " = " + Calculator.substract(a,b));
        System.out.println("Mnożenie: " + a + " * " + b + " = " + Calculator.multiply(a,b));
        System.out.println("Dzielenie: " + a + " / " + b + " = " + Calculator.divide(a,b));
        System.out.println("Potęgowanie: " + a + " ^ " + b + " = " + Calculator.pow(a,b));

    }

}
