package sda.lekcja04_4;
/*
Napisać klasę BigNumber która będzie reprezentować dowolnej (ograniczoną ilością pamięci) wielkości liczbę całkowitą.
Napisać klasę BigNumberKalkulator do wykonywania działań arytmetycznych na BigNumber.
PODPOWIEDZ: Pomyślej w pierwszej kolejności jak przechowywać taką liczbę, a w drugiej jak dodać takie liczby.
 */

public class Main {
    public static void main(String[] args){

        // działa tylko na liczbach dodatnich, a odejmowanie tylko gdy pierwsza liczba większa od drugiej

        BigNumber number1 = new BigNumber("200");
        BigNumber number2 = new BigNumber("-100");



        BigNumber number3 = BigNumberCalculator.add(number1, number2);
        BigNumber number4 = BigNumberCalculator.substract(number1, number2);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);










    }
}
