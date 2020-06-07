
public class Podstawy1 {
    public static void main(String[] args) {



        // zadanie 1
        System.out.println("Zadanie 1");
        double score1 = pow(10, -4);
        System.out.println("Potęgowanie:    10 * -4 = " + score1);
        System.out.println("\n");

        // zadanie 2
        System.out.println("Zadanie 2");
        long score2 = multiply(1,2,3,4,2);
        System.out.println("Mnożenie:   1 * 2 * 3 * 4 * 2 = " + score2);
        System.out.println("\n");

        // zadanie 3
        System.out.println("Zadanie 3");
        int score3 = sumIfDigits(123);
        System.out.println("Suma cyfr liczby " + 123 + " wynosi: " + score3);
        System.out.println("\n");

        // zadanie 4
        System.out.println("Zadanie 4");
        flaga();
        System.out.println("\n");

        // zadanie 6
        System.out.println("Zadanie 6");
        int score6 = silnia(4);
        System.out.println("Silnia liczby 4 wynosi: " + score6);
        System.out.println("\n");

        // zadanie 7
        System.out.println("Zadanie 7");
        String score7 = calculateSecondsToTime(86399);
        System.out.println(score7);
        System.out.println("\n");

        // zadanie 8
        System.out.println("Zadanie 8");
        int[] liczby = {1, 45, 564, 7867, 34, 5456, 210};
        printGratedThenHundred(liczby);
        System.out.println("\n");

        // zadanie 9
        System.out.println("Zadanie 9");
        printOddNumbers(liczby);
        System.out.println("\n");

        // zadanie 10
        System.out.println("Zadanie 10");
        int[] score10 = reverseTable(liczby);
        for (int i = 0; i < liczby.length; i++) {
            System.out.print(liczby[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < liczby.length; i++) {
            System.out.print(score10[i] + " ");
        }
        System.out.println("\n");
    }


    // 1. Napisać metodę która policzy potege danej liczby całkowitej. Tj. przyjmuje dwa argumenty typu int i zwraca typ long. Nie używać gotowych funkcji w javie. Wywołać stworząną funkcje kilka razy w metodzie main każdy wynik działania wypisać na konsole.
    // komentarz: metoda nie może zwracać typu long, ponieważ dla potęg ujemnych wartości są zmiennoprzecinkowe, dlatego moja metoda zwraca double

    public static double pow(int a, int b) {
        double c = a;
        if (b == 0) {
            c = 1;
        }
        if (b == 1) {
            c = a;
        }
        if (b > 1) {
            for (int i = 1; i < b; i++) {
                c = c * a;
            }
        }
        if (b < 0) {
            for (int i = 1; i < -b; i++) {
                c = c * a;
            }
            c = 1 / c;
        }
        return c;
    }

    // 2. Napisać metodę która przyjmuje dowolną liczbę argumentów typu int (skorzystać ze składnie zmiennej liczny argumetów) i zwróci iloczyn tych liczb.

    public static long multiply (int... numbers){
        long[] a = new long[numbers.length];
        a[0] = numbers[0];
        for(int i = 0; i < numbers.length-1; i++){
            a[i+1] = a[i] * numbers[i+1];
        }
        return a[numbers.length-1];
    }

    // 3. Napisać metodę która przyjmuje jedną liczbę (int) i zwraca sume cyr tej liczby.

    public static int sumIfDigits(int a){
        String aToString = Integer.toString(a);
        char[] c = aToString.toCharArray(); // zamiana stringa na tablicę znaków
        int wynik = 0;
        for (int i = 0; i < aToString.length(); i++) {
            wynik = wynik + Character.getNumericValue(c[i]);
        }
        return wynik;
    }
    
    // 4. Napisz program, który wyświetli na konsoli amerykańską flagę
    
    public static void flaga(){

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 6; i++) {
                System.out.print("* ");
            }
            System.out.print(" ");
            for (int i = 0; i < 34; i++) {
                System.out.print("=");
            }
            System.out.print("\n");
            for (int i = 0; i < 6; i++) {
                System.out.print(" *");
            }
            System.out.print(" ");
            for (int i = 0; i < 34; i++) {
                System.out.print("=");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < 6; i++) {
            System.out.print("* ");
        }
        System.out.print(" ");
        for (int i = 0; i < 34; i++) {
            System.out.print("=");
        }
        System.out.print("\n");
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 47; i++) {
                System.out.print("=");
            }
            System.out.print("\n");
        }
    }

    // 5. Napisz metodę, który przyjume dwie liczby całkowie, i zwraca true jeśli pierwsza jest większa lub równa od drugiej i false jeśli przeciwnie

    public static boolean ifBigger(int a, int b){
        if (a >= b){
            return true;
        } else {
            return false;
        }
    }

    // 6. Napisać metodę która przyjmuje liczbę całkowitą (int) i zwraca obliczoną silnie tej liczby.

    public static int silnia(int a){
        int silnia = a;
        for (int i = a; i > 1 ; i--) {
            silnia = silnia * (i-1);
        }
        return silnia;
    }

    // 7. Napisz metodę która przyjmuje liczbę całkowitą (int), która będzie oznaczać liczbę sekund. Metoda ma zwracać string który będzie wskazywał ile to jest godzin minut i sekund.

    public static String calculateSecondsToTime(int a){
        int hours = a/3600;
        int minutes = (a - (hours * 3600)) / 60;
        int seconds = a - hours * 3600 - minutes * 60;
        String score = hours + ":" + minutes + ":" + seconds;
        return score;
    }

    // 8. Napisz metodę, która przayjmuje talicę int-ów i nic nie zwraca za to wypisuje na konsoli te liczby z tablicy którę są większe od 100.
    public static void printGratedThenHundred(int[] liczby){
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] > 100){
                System.out.println(liczby[i]);
            }
        }
    }

    // 9. Napisz metodę, która przayjmuje talicę int-ów i nic nie zwraca za to wypisuje na konsoli te liczby z tablicy którę są parzyste.
    public static void printOddNumbers(int[] liczby){
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] % 2 == 0){
                System.out.println(liczby[i]);
            }
        }
    }

    // 10. Napisz metodę, który przjmuje tablicę liczb (int) i zwraca też tablicę, lizcb która jest odwróconą talicę tej która przyszła jako argumenty
    public static int[] reverseTable(int[] liczby){
        int[] reversedTable = new int[liczby.length];
        for (int i = 0; i < liczby.length; i++) {
            reversedTable[i] = liczby[liczby.length-1-i];
        }
        return reversedTable;
    }

    
  



























}
