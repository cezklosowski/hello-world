
public class Zadanka3 {
    public static void main(String[] args) {

        // Zadanie 1
        zadanie1();

        //Zadanie2
        zadanie2();

        // Zadanie 3
        zadanie3();

        // Zadanie 4
        System.out.println("Zadanie 4");
        int n = 4;
        zadanie4(n);

        // Zadanie 5
        System.out.println("Zadanie 5");
        zadanie5(n);

        // Zadanie 6
        System.out.println("Zadanie 6");
        zadanie6(n);

        // Zadanie 7
        // zadanie identyczne jak zadanie 6.

        // Zadanie 8
        System.out.println("Zadanie 8");
        int score8 = zadanie8(n);
        System.out.println("Dla n = " + n + " wartość wynosi: " + score8);

        // Zadanie 9
        System.out.println("Zadanie 9");
        String a = "domek";
        String score9 = zadanie9(a);
        System.out.println(a);
        System.out.println(score9);

        // Zadanie 10
        System.out.println("Zadanie 10");
        int[] numbers = {14, 25, 44, 92, 3 , 0, 88, 91};
        zadanie10(numbers);

        // Zadanie 11
        System.out.println("Zadanie 11");
        int number = 123;
        zadanie11(number);

        // Zadanie 12
        System.out.println("Zadanie 12");
        String text = "kajak";
        boolean score12 = zadanie12(text);
        if (score12){
            System.out.println("Słowo " + text + " jest palindromem");
        } else {
            System.out.println("Słowo " + text + " nie jest palindromem");
        }

    }



    // 1.Napisać metodę statyczną (w tej samej klasie co metoda main) która nie przyjmuje żadych argumentów i zwraca void i która wypisuje 20 kolejnych liczb od 0
    public static void zadanie1(){
        System.out.println("Zadanie 1");
        // pętla for
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        // pętla while
        int i = 1;
        while(i <= 20){
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");
    }

    // 2.Napisać metodę statyczną (w tej samej klasie co metoda main) która nie przyjmuje żadych argumentów i zwraca void i która wypisuje kolejnych liczb nieparzystych
    public static void zadanie2(){
        System.out.println("Zadanie 2");
        // pętla for
        for (int i = 1; i <= 40; i=i+2) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        // pętla while
        int i = 1;
        while(i <= 40){
            System.out.print(i + " ");
            i = i + 2;
        }
        System.out.print("\n");
    }

    // 3. Napisać metodę która robi dokładnie to samo co w zadaniu pierwszy ale użyć pętli for w ten sposób, że licznik zaczyna się od 15, i po każdym przebiegu pętli jest zwiększany o 3
    public static void zadanie3(){
        System.out.println("Zadanie 3");
        // pętla for
        for (int i = 15; i <= 72; i=i+3) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        // pętla while
        int i = 15;
        while(i <= 72){
            System.out.print(i + " ");
            i = i + 3;
        }
        System.out.print("\n");
    }

    // 4. Napisać metodę statyczną (w tej samej klasie co metoda main) która przyjmuje argument w postaci liczby całkowitej 'n' a następne tworzy tablicę dwuwymiarąwą
    //   n x n po czym wypełnia całą wartościami 3 i wypisuje na ekran. Metoda kończąc działanie nie zwraca żadnego wyniku.
    public static void zadanie4(int n){
        int[][] tab = new int[n][n];
        // wypełnienie tablicy
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tab[i][j] = 3;
            }
        }
        // wypisanie tablicy
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    // 5. Napisać metodę statyczną (w tej samej klasie co metoda main) która przyjmuje argument w postaci liczby całkowitej 'n' a następne tworzy tablicę dwuwymiarąwą
    //n na n po czym wypełnia całą oprócz przekątnej wartościami 0 a przekątną 1. Metoda kończąc działanie nie zwraca żadnego wyniku.
    public static void zadanie5(int n){
        int[][] tab = new int[n][n];
        // wypełnienie tablicy
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                    tab[i][j] = 1;
                } else {
                    tab[i][j] = 0;
                }
            }
        }
        // wypisanie tablicy
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    // 6. Zadanie jak 5 z tym że wypisuje tablicę dwuwymiarową w następującej postaci:
    public static void zadanie6(int n){
        int[][] tab = new int[n][n];
        // wypełnienie tablicy
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n-i-1){
                    tab[i][j] = 1;
                } else {
                    tab[i][j] = 0;
                }
            }
        }
        // wypisanie tablicy
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    // 7. Napisać metodę statyczną (w tej samej klasie co metoda main) która przyjmuje argument w postaci liczby całkowitej 'n' a następne tworzy tablicę dwuwymiarąwą
    //   n x n po czym wypełnia całą oprócz "drugiej" przekątnej wartościami 0 a "drugą" przekątną 1. Metoda kończąc działanie nie zwraca żadnego wyniku.

    // zadanie identyczne jak zadanie 6.

    // 8. Napisać metodę któa przyjmie liczbę całkowitą n i zwróci liczbe całkowitą która jest równa:
    //(1*1) + (2*2) + (3*3) + (4*4) + (5*5) + ... + (n*n)
    public static int zadanie8(int n){
        int score = 0;
        for (int i = 1; i <= n; i++) {
            score = score + i*i;
        }
        return score;
    }

    // 9. Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument.
    public static String zadanie9(String object){
        String reversedObject = "";

        /*
        // metoda 1 - funkcja charAt
        for (int i = 0; i < object.length(); i++) {
            reversedObject = reversedObject + object.charAt(object.length()-1-i);
        }

        */

        // metoda 2 - CharArray
        char[] score = object.toCharArray();
        char[] scoreReversed = new char[score.length];
        for (int i = 0; i < score.length; i++) {
            scoreReversed[i] = score[score.length-1-i];
        }
        reversedObject = new String(scoreReversed);

        return reversedObject;
    }

    // 10. Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci “[liczba, liczba, liczba]”
    public static void zadanie10(int[] tab){
        System.out.print("[" + tab[0]+ ", ");
        for (int i = 1; i < tab.length-1; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[tab.length-1]+ "]");
    }

    // 11. Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając od ostatniej cyfry (np. dla liczby 123 będą to trzy linie z 3, 2 i 1),
    public static void zadanie11(int a){
        String number = Integer.toString(a);
        for (int i = 0; i < number.length(); i++) {
            System.out.println(number.charAt(number.length()-1-i));
        }
    }

    // 12. Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem. Np. “kajak” jest palindromem (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie. Może przydać Ci się metoda String#toCharArray
    public static boolean zadanie12(String object){
        String reversedObject = "";
        boolean ifEqual = false;
        for (int i = 0; i < object.length(); i++) {
            reversedObject = reversedObject + object.charAt(object.length()-1-i);
        }
        if (object.equalsIgnoreCase(reversedObject)){
            ifEqual = true;
        }
        return ifEqual;
    }


}
