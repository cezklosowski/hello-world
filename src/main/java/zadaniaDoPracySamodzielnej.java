import java.util.Scanner;

public class zadaniaDoPracySamodzielnej {
    public static void main(String[] args) {

        // Zmień program tak, aby na ekranie zostało wypisane: "Witaj, świecie!"
        zadanie1();

        // Zmień program tak, aby na ekranie zostało wypisane: "Witaj, świecie!"
        zadanie2();

        // Jakiego typu danych potrzebujemy żeby przechowywać PESEL?
        /* PESEL jest ciągiem 11 cyfr, więc w zależności w jakiej formie chcemy go zapisać może być liczbą typu long
         lub ciągiem znaków typu string */

        // Poukładaj typy danych rosnącą pojemnością: long, short, int, byte
        /* byte, short, int, long */

        // Co oznacza litera 'L' lub 'l' na na końcu wartości liczbowej przypisywanej do zmiennej?
        /* Sygnalizacja kompilatorowi, że liczba ma typ long */

        // Jak zapisać liczbę do zmiennej typu String?
        /* Za pomocą zwykłego operatora =. Konwersja jest automatyczna i wykorzystuje metodę toString */

        // Czy operacje arytmetyczne możemy wykonywać na różnych typach danych?
        /* Nie, dane muszą być tego samego typu. Jeśli są różnego typu, trzeba przeprowadzić wcześniejszą konwersję. */

        // Stwórz zmienną do której zapiszesz wynik działania: 4*27
        int a = 4*7;
        // Stwórz zmienną do której zapiszesz wynik działania: 31/5
        float b = 31/5;
        // Wypisz na ekran wynik sprawdzenia czy liczba 10 jest równa liczbie 5.
        if (10 == 5){
            System.out.println("Liczba 10 jest równa liczbie 5.");
        } else {
            System.out.println("Liczba 10 nie jest równa liczbie 5.");
        }

        // Napisz program, w którym tworzysz zmienną, do której przypiszesz swój
        //PESEL. Następnie, jeżeli jest on parzysty, wypisz na ekran: "Twój PESEL
        //jest parzysty", a jeżeli jest nieparzysty, to wypisz na ekran: "Twój PESEL
        //jest nieparzysty".
        zadanie3();

        // Wypisz 10 razy swoje imię na ekranie.
        for (int i = 0; i < 10; i++){
            System.out.println("Cezary");
        }

        // Wypisz na ekranie liczby od 0 do 100.
        for (int i = 0; i <= 100; i++){
            System.out.println(i);
        }

        // Stwórz program, w którym będą 2 zmienne służące do przechowywania liczb.
        //Stwórz trzecią zmienną, która zawierać będzie zsumowane wartości zmiennych
        //1 i 2.
        // Następnie wypisz na ekran słowo "Obliczenia" tyle razy, jaka jest wartość 3
        //zmiennej.
        zadanie4();


    }

    public static void zadanie1() {
        System.out.println("Witaj, świecie!");
    }

    public static void zadanie2() {
        System.out.println("Witaj, świecie!");
        System.out.println("To mój pierwszy program");
    }

    public static void zadanie3(){
        System.out.println("Podaj swój PESEL");
        Scanner myScanner = new Scanner(System.in);
        long myPESEL = myScanner.nextLong();
        if (myPESEL % 2 == 0){
            System.out.println("Twój PESEL jest parzysty");
        } else{
            System.out.println("Twój PESEL jest nieparzysty");
        }
    }

    public static void zadanie4() {
        System.out.println("Podaj pierwszą liczbę: ");
        Scanner myScanner = new Scanner(System.in);
        int number1 = myScanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int number2 = myScanner.nextInt();
        int number3 = number1 + number2;
        for (int i = 0; i < number3; i++){
            System.out.println("Obliczenia");
        }
    }

}



