public class Podstawy2PetleITablice {
    public static void main(String[] args) {

        // Zadanie 1
        System.out.println("Zadanie 1");
        float[] liczby = {2.0F, 3.0F, 5.0F};
        float score1 = avarage(liczby);
        System.out.print("Średnią liczb: ");
        for (int i = 0; i < liczby.length; i++) {
            System.out.print(liczby[i] + " ");
        }
        System.out.println("jest liczba: " + score1);

        // Zadanie 2
        System.out.println("Zadanie 2");
        int[] liczby2 = {2, 3, 5};
        int liczba = 2;
        boolean doesArrayContainsValue = doesArrayContainsValue(liczby2, liczba);
        if (doesArrayContainsValue == true){
            System.out.println("Liczba " + liczba + " występuje w tablicy");
        } else {
            System.out.println("Liczba " + liczba + " nie występuje w tablicy");
        }

        // Zadanie 3
        System.out.println("Zadanie 3");
        int score3 = getIndeks(liczby2, liczba);
        if (score3 == -1){
            System.out.println("Liczba " + liczba + " nie występuje w tablicy");
        } else {
            System.out.println("Liczba " + liczba + " występuje w tablicy pod indeksem " + score3);
        }

        // Zadanie 4
        System.out.println("Zadanie 4");
        int score4 = maxInArray(liczby2);
        if (score4 == -1){
            System.out.println("Tablica jest pusta");
        } else {
            System.out.println("Największa wartość w tablicy wynosi: " + score4);
        }

        // Zadanie 5
        System.out.println("Zadanie 5");
        String[] napisy = {"aaaa", "bbbb", "ccccc"};
        String[] score5 = reverseTableOfStrings(napisy);
        for (int i = 0; i < napisy.length; i++) {
            System.out.print(napisy[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < score5.length; i++) {
            System.out.print(score5[i]);
        }
        System.out.print("\n");

        // Zadanie 6
        System.out.println("Zadanie 6");
        int[] liczby3 = {2, 3, 5, 56, 87, 12, 9, 2};
        printHalfTable(liczby3);

        // Zadanie 7
        System.out.println("Zadanie 7");
        int[] liczby4 = {2, 3, 5};
        int[] liczby5 = {7, 10, 0};
        int[] score7 = sumOfTables(liczby4, liczby5);
        if (score7 == null){
            System.out.println("Tablice są różnej długości");
        } else{
            for (int i = 0; i < score7.length; i++) {
                System.out.print(score7[i] + " ");
            }
            System.out.print("\n");
        }

        // Zadanie 8
        System.out.println("Zadanie 8");
        boolean score8 = checkTables(liczby4, liczby5);
        if (score8 == true){
            System.out.println("Tablice są takie same");
        } else {
            System.out.println("Tablice nie są takie same");
        }

        // Zadanie 9
        System.out.println("Zadanie 9");
        int liczba2 = 13;
        boolean score9 = ifPrime(liczba2);
        if (score9 == true){
            System.out.println("Liczba " + liczba2 + " jest pierwsza");
        } else {
            System.out.println("Liczba " + liczba2 + " nie jest pierwsza");
        }

        // Zadanie 10
        System.out.println("Zadanie 10");
        int[] liczby6 = {0, 0, 5, 3, 1, 3, 5, 2, 7, 2, 8};
        printDuplicates(liczby6);

    }

    // 1. Napisz metodę która przyjmuje tablicę float-ów i zwraca float który jest średnią wszystkich wartości w tablicy.
    public static float avarage(float[] liczby){
        float sum = 0;
        for (int i = 0; i < liczby.length; i++) {
            sum = sum + liczby[i];
        }
        return sum/liczby.length;
    }

    // 2. Napisz metodę, która przyjmuje dwa argumenty, pierwszy to tablica int-ów, drugi to pojedyńczy int. Metoda zwraca true jeśli drugi argument
    //znajduje się w  podanej tablicy lub false w przeciwnym przypadku.
    public static boolean doesArrayContainsValue(int[] liczby, int liczba){
        boolean score = false;
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] == liczba){
                score = true;
                break;
            }
        }
        return score;
    }

    // 3. Napisz metodę, która przyjmuje dwa argumenty, pierwszy to tablica int-ów, drugi to pojedyńczy int. Metoda zwraca int który jest indeksem wartości podanej
    //jako argument drugi jeśli ten argument istnieje w tablicy lub -1 w przeciwnym przypadku.
    public static int getIndeks(int[] liczby, int liczba){
        int score = 0;
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] == liczba){
                score = i;
                break;
            } else {
                score = -1;
            }
        }
        return score;
    }

    // 4. Napisz metodę, która tablicę int-ów i zwraca int - który jest największy w tej tablicy lub -1 jeśli tablica jest pusta
    public static int maxInArray(int[] liczby){
        int max = 0;
        // czy tablica jest pusta
        if (liczby == null){
            max = -1;
        } else {
            max = liczby[0];
            for (int i = 0; i < liczby.length; i++) {
                if (max < liczby[i]){
                    max = liczby[i];
                }
            }
        }
        return max;
    }

    // 5. Napisz metodę, która przyjmuje tablicę String-ów i tworzy nową tablicę Strintów, która jest odwróconą pierwszą
    public static String[] reverseTableOfStrings(String[] napisy){
        String[] score = new String[napisy.length];
        for (int i = 0; i < napisy.length; i++) {
            score[i] = napisy[napisy.length-1-i];
        }
        return score;
    }



    // 6. Napisz metodę która przyjmuje tablicę int-ów i nic nie zwraca za to wyświetla na ekranie co drugi element tablicy
    public static void printHalfTable(int liczby[]){
        for (int i = 1; i < liczby.length; i=i+2) {
            System.out.println(liczby[i]);
        }
    }


    // 7. Napisz metodę, która dwie tablice intów  jeśli tablice są różnej długości to metoda zwraca pustą tablicę a jeśli tej samej długości to zwracamy tablicę która jest
    //która zawiera sumy elementów na poszczególnych pozycjach
    public static int[] sumOfTables(int[] liczby1, int[] liczby2){
        int[] score = new int[liczby1.length];
        if (liczby1.length != liczby2.length){
            score = null;
        } else{
            for (int i = 0; i < liczby1.length; i++) {
                score[i] = liczby1[i] + liczby2[i];
            }
        }
        return score;
    }



    // 8. Napisz metodę, która przyjmuje dwie tablicy intów i zwraca true jeśli obie tablice są tej samej długości i mają takie same wartoście lub false w przeciwnym wypadku.
    public static boolean checkTables(int[] liczby1, int[] liczby2){
        boolean score = false;
        boolean status = true;
        if (liczby1.length == liczby2.length){
            for (int i = 0; i < liczby1.length; i++) {
                if (liczby1[i] != liczby2[i]){
                    status = false;
                }
            }
            if (status == true){
                score = true;
            }
        }

        return score;
    }


    // 9. Napisz metodę która przyjmuje jako argument liczbę całkowitą (int) i zwraca true jeśli podana liczba jest pierwsza lub false w przeciwnym wypadku
    public static boolean ifPrime(int a){
        boolean score = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0){
                score = false;
                break;
            }
        }
        return score;
    }


    // 10. (Dodatkowe) Napisz metodę, która przyjmie tablice int-ów i nie zwraca żadnej wartości (void) za to wypisuje na ekran te elementy tablicy które się powtarzają.
    public static void printDuplicates(int[] liczby){
        int[] score = new int[liczby.length];
        int k = 0;
        boolean ifDownloaded = false;
        for (int i = 0; i < liczby.length; i++) {
            for (int j = 0; j < liczby.length; j++) {
                if (liczby[i] == liczby[j] && i != j){
                    // sprawdzenie czy już nie pobrało tej liczby
                    for (int l = 0; l < score.length; l++) {
                        if (score[l] == liczby[i]){
                            ifDownloaded = true;
                        }
                    }
                    if (ifDownloaded == false){
                        // pobranie liczby
                        score[k] = liczby[i];
                        k++;
                    }
                }
            }
            ifDownloaded = false;
        }
        // wypisanie powtarzających się liczb
        for (int i = 0; i < score.length; i++) {
            if(score[i] != 0){
                System.out.println(score[i]);
            }
        }
    }








































}
