package sda.lekcja05.zadania_d1;

public class Main {
    public static void main(String[] args) {

        /*
        1. Wypisz poniższy kawałek tabliczki mnożenia:
        5 x 1 = 5
        5 x 2 = 10
        5 x 3 = 15
        5 x 4 = 20
        Zmodyfikuj powyższe żeby wyświetlało ten kawałek tabliczki dla liczby zadanej w parametrze
         */

        System.out.println("Zadanie 1");
        for (int i = 1; i <= 4; i++) {
            System.out.println("5 x " + i + " = " + 5 * i);
        }
        System.out.println();

        /*
        2. Dla danej liczby sprawdź, czy jest ona liczbą pierwszą.
         */

        System.out.println("Zadanie 2");
        int number2 = 7;
        boolean isPrime = isPrime(number2);
        if (isPrime == true) {
            System.out.println("Liczba " + number2 + " jest liczbą pierwszą.");
        } else {
            System.out.println("Liczba " + number2 + " nie jest liczbą pierwszą.");
        }
        System.out.println();

        /*
        3. Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y
         */

        // Nie rozumiem polecenia. Sumę których liczb? Z przedziału (X,Y)? Których? Wszystkich? Zrobiłem wypisanie wszystkich.
        System.out.println("Zadanie 3");
        sum(1, 4);
        System.out.println();

        /*
        4. Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.
         */
        System.out.println("Zadanie 4");
        int[] tab4 = {12, 7, 19};
        printTabInt(tab4);
        int buffer4 = tab4[0];
        tab4[0] = tab4[2];
        tab4[2] = buffer4;
        printTabInt(tab4);
        System.out.println();

        /*
        5. Dla zadanej tablicy intów wyświetl najmniejszą oraz największą liczbę z tablicy
         */
        System.out.println("Zadanie 5");
        int[] tab5 = {6, 1, 4, 23, 71, 14, 2, 8, 63, 17, 14};
        printTabInt(tab5);
        System.out.println("Najmniejszą liczbą w tablicy jest " + minTab(tab5));
        System.out.println("Największą liczbą w tablicy jest " + maxTab(tab5));
        System.out.println();

        /*
        6. Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych. Jeśli takie występują utwórz nową tablicę,
        do której przepisze tylko te ujemne liczby
         */
        System.out.println("Zadanie 6");
        int[] tab6 = {3, 6, -2, 2, -6, 6, 2, -6, -32, 29, 5, 90, 102, -42, 11};
        printTabInt(tab6);
        System.out.println("W tablicy jest " + coutNagative(tab6) + " liczb ujemnych.");
        printTabInt(tabNegative(tab6));
        System.out.println();

        /*
        7. Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie, różnicy ciągu
         */
        System.out.println("Zadanie 7");
        int length7 = 10;
        int firseElement7 = 4;
        int difference7 = 3;
        printTabInt(arithmeticSeries(length7, firseElement7, difference7));
        System.out.println();

        /*
        8. Sprawdź, czy podany ciąg liczb jest ciągiem arytmetycznym
         */
        System.out.println("Zadanie 8");
        int[] tab8 = {1, 3, 5, 7, 9};
        boolean isArithmetic = isArithmetic(tab8);
        if (isArithmetic) {
            System.out.println("Ciąg");
            printTabInt(tab8);
            System.out.println("jest ciągiem arytmetycznym.");
        } else {
            System.out.println("Ciąg");
            printTabInt(tab8);
            System.out.println("nie jest ciągiem arytmetycznym.");
        }
        System.out.println();

        /*
        9. Załóżmy, że nie wiesz, że istnieje operator %, a potrzebujesz wylicz resztę z dzielenia dwóch liczb.
        Napisz własną wersję funkcji modulo.
         */
        System.out.println("Zadanie 9");
        int a9 = 4;
        int b9 = 3;
        System.out.println("Reszta z dzielenia " + a9 + " przez " + b9 + " wynosi " + modulo(a9, b9));
        System.out.println();

        /*
        10. Właśnie się dowiedziałeś, że istnieje operator %. Napisz funkcję, która będzie sprawdzała, czy napisana
        w poprzednim zadaniu funkcja zwraca dokładnie takie same wyniki jak ten operator.
        Przetestuj dla różnych przypadków
         */
        System.out.println("Zadanie 10");
        int a10 = 4;
        int b10 = 3;
        if (isMyModuloCorrect(a10, b10)) {
            System.out.println("Moja funkcja modulo działa poprawnie");
        } else {
            System.out.println("Moja funkcja modulo nie działa poprawnie");
        }
        System.out.println();

    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return isPrime;
    }

    public static void sum(int X, int Y) {

        for (int i = Math.min(X, Y); i <= Math.max(X, Y); i++) {
            for (int j = Math.min(X, Y); j <= Math.max(X, Y); j++) {
                System.out.println(i + " + " + j + " = " + (i + j));
            }


        }
    }

    public static int minTab(int[] tab) {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    public static int maxTab(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    public static int coutNagative(int[] tab) {
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] tabNegative(int[] tab) {
        int counter = coutNagative(tab);
        int[] tabNegagtive = new int[counter];
        int j = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                tabNegagtive[j] = tab[i];
                j++;
            }
        }
        return tabNegagtive;
    }

    public static void printTabInt(int[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[tab.length - 1] + "]");
    }

    public static int[] arithmeticSeries(int length, int firstElement, int difference) {
        int[] series = new int[length];
        series[0] = firstElement;
        for (int i = 1; i < length; i++) {
            series[i] = series[i - 1] + difference;
        }
        return series;
    }

    public static boolean isArithmetic(int[] tab) {
        boolean score = true;
        int r = tab[1] - tab[0];
        for (int i = 2; i < tab.length - 1; i++) {
            if (tab[i + 1] - tab[i] != r) {
                score = false;
                break;
            }
        }
        return score;
    }

    public static int modulo(int a, int b) {
        return a - (a / b) * b;
    }

    public static boolean isMyModuloCorrect(int a, int b) {
        return modulo(a, b) == a % b;
    }

}
