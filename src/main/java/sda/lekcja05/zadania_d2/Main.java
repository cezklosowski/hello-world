package sda.lekcja05.zadania_d2;

public class Main {
    public static void main(String[] args) {

        /*
        1. Dla podanej liczby oznaczającej numer dnia tygodnia, wypisz nazwę tego dnia.
         */
        System.out.println("Zadanie 1");
        byte number1 = 5;
        switch (number1) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
        }
        System.out.println();

        /*
        2. Do klasy Person dodaj informację o płci.
         */

        /*
        3. Napisz klasę Complex do obsługi liczb zespolonych. Klasa powinna posiadać:
        a) Konstruktor
        b) Drugi konstruktor dla przypadku, gdy część urojona jest równa zero
        c) Metodę print wypisującą liczbę w postaci a + b*i (pamiętaj o przypadkach,
        gdy część urojona jest równa zero lub mniejsza od zera)
         */
        System.out.println("Zadanie 3");
        Complex numer3_1 = new Complex(2);
        //numer3_1.print();
        Complex numer3_2 = new Complex(2, 3);
        //numer3_2.print();
        Complex numer3_3 = new Complex(2, -3);
        //numer3_3.print();

        /*
        4. Zamiast metody print nadpisz metodę toString.
         */
        System.out.println(numer3_1);
        System.out.println(numer3_2);
        System.out.println(numer3_3);
        System.out.println();

        /*
        5. Do klasy Complex dopisz metodę isEqualTo, która sprawdzi, czy bieżący obiekt ma takie
        same części rzeczywistą i urojoną jak liczba przekazana w parametrze tej funkcji.
         */
        System.out.println("Zadanie 5");
        Complex z1 = new Complex(3, 5);
        Complex z2 = new Complex(3, 5);
        Complex z3 = new Complex(5, 3);
        //System.out.println(z1 + " = " + z2 + " ? " + z1.isEqualTo(z2));
        //System.out.println(z2 + " = " + z3 + " ? " + z2.isEqualTo(z3));

        /*
        6. Zamiast metody isEqualTo nadpisz metodę equals.
         */
        System.out.println(z1 + " = " + z2 + " ? " + z1.equals(z2));
        System.out.println(z2 + " = " + z3 + " ? " + z2.equals(z3));
        System.out.println();

        /*
        7. Napisz metodę, która dodaje dwie liczby zespolone.
         */
        System.out.println("Zadanie 7");
        Complex z4 = Complex.addTwoNumbers(z1, z2);
        System.out.println(z4);
        System.out.println();

        /*
        8. Napisz metodę, która do danej liczby zespolonej doda drugą liczbę zespoloną
        */

        /*
        9. Napisz metodę, która dodaje trzy liczby zespolone.
        */
        System.out.println("Zadanie 9");
        Complex z5 = Complex.addThreeNumbers(z1, z2, z3);
        System.out.println(z5);
        System.out.println();

        /*
        10. Napisz metodę, która dodaje dowolną ilość liczb zespolonych
         */
        System.out.println("Zadanie 10");
        Complex z6 = Complex.addNumbers(z1,z2,z3,z4);
        System.out.println(z6);
        System.out.println();

        /*
        11. Napisz metodę, która zwróci ile zostało już utworzonych liczb zespolonych.
         */
        System.out.println("Zadanie 11");
        System.out.println("Do tej pory utworzono " + Complex.howMuchNumbers() + " liczb zespolonych");
        System.out.println();

        /*
        12. Napisz klasę OrderItem (pozycja zamówienia):
        a) będzie ona przechowywała następujące informacje:
        1. Nazwa produktu
        2. Ilość
        3. Cena jednostkowa
        b) Napisz odpowiedni konstruktor.
        c) Klasa powinna również zawierać metody:
        1. getValue – oblicza wartość danej pozycji zamówienia
        2. isCorrect – sprawdza, czy pozycja jest prawidłowa, tzn. ilość i cena są większe od zera
        3. print – wyświetla daną pozycję zamówienia, np. Cukier 4,00 zł 3 szt 12,00 zł
        */
        System.out.println("Zadanie 12");
        OrderItem item1 = new OrderItem("Cukier", 3, 4.00);
        OrderItem item2 = new OrderItem("Chleb", 1, 3.50);
        OrderItem item3 = new OrderItem("Mleko", 4, 3.00);
        item1.print();
        item2.print();
        item3.print();
        System.out.println();

        /*
        13. Napisz klasę Order (zamówienie):
        a) w tablicy będzie ona przechowywała pozycje zamówienia.
        b) Napisz konstruktor, który utworzy zamówienie o zadanej liczbie pozycji.
        c) Klasa powinna również zawierać metody:
        1. addItem – dodaje pozycję zamówienia, ale tylko wtedy, gdy w
        zamówieniu jest jeszcze miejsce i jeżeli pozycja zamówienia jest
        prawidłowa
        2. getValue – oblicza łączną wartość zamówienia
        3. getItemsCount – oblicza łączną liczbę zamówionych produktów
        4. print – wyświetla dane zamówienia, np.
            Chleb 3,50zł 1 szt 3,50zł
            Cukier 4,00 zł 3 szt 12,00 zł
            Wartość zamówienia: 15,50 zł
        */
        System.out.println("Zadanie 13");
        Order order1 = new Order(2);
        order1.addItem(item1);
        order1.addItem(item2);
        //order1.addItem(item3);
        //System.out.println("Wartość zamówienia wynosi: " + order1.getValue() + " zł.");
        //System.out.println("W zamówieniu znajduje się " + order1.getItemsCount() + " produktów.");
        order1.print();
        System.out.println();

    }

}
