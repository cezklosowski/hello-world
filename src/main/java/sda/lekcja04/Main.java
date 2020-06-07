package sda.lekcja04;

/*
Zadanie 1: Napisz klasę MyNumber, która przechowuję liczb całkowitą.
Klasa powinna mieć dwa konstruktory-bezargumentowy oraz 1
argumentowy przyjmujący liczbę typu long.
Klasa powinna mieć następujące metody:
-isOdd - zwraca true jeśli liczba jest parzysta w przeciwnym wypadku false
-isEven - zwraca true jeśli liczba jest nieparzysta w przeciwnym wypadku
-abs - zwraca wartość bezwzględną liczby-pow-zwraca kwadrat naszej liczby
-add - przyjmuję liczbę (MyNumber) i zwraca Liczbę będącą sumą
-multiply – przyjmuje liczba i zwraca liczbę będącą iloczynem
 */

/*
Zadanie 2: Napisz następujące klasy wraz z wymienionymi polami.
Napisz metody ustawiające wartości i pobierające pola (geti set)
Pielęgniarka: imię, nazwisko, wiek, pensja, tytuł, nadgodziny
Lekarz: imię, nazwisko, wiek, pensja, specjalizacja, premia
Portier: imię, nazwisko, wiek, pensja, zmiana (Nocna, Dzienna → enum)
 */

/*
Zadanie 3:
Zmodyfikuj klasy z ćwiczenia 4 tak aby wszystkie dziedziczyły ze wspólnej klasy Pracownik
 */



public class Main {
    public static void main(String[] args) {

        MyNumber number1 = new MyNumber(5);
        MyNumber number2 = new MyNumber(8);

        System.out.println(number1.isOdd());
        System.out.println(number1.isEven());
        System.out.println(number1.pow());
        System.out.println(number1.add(number2).value());
        System.out.println(number1.multiply(number2).value());

        Portier po1 = new Portier();
        po1.setImie("Janusz");
        po1.setNazwisko("Moczywąs");
        po1.setZmiana(Zmiana.DZIENNA);
        System.out.println(po1.getImie());
        System.out.println(po1.getNazwisko());
        System.out.println(po1.getZmiana());


    }

}
