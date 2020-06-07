/*
1. Sprawdź czy podana przez użytkownika liczba jest liczbą pierwszą

2. Zwróć dwie ostatnie cyfry silni liczby podanej przez użytkownika.

3. Usuń wszystkie samogłoski z podanego przez użytkownika wyrazu

4. Napisz metodę która sklei ze sobą dwa łańcuchy biorąc na przemian po jednym znaku z każdego łańcucha. Należy wziąć po tyle znaków ile jest w krótszym łańcuchu.

5. Sprawdź, czy podana liczba 11-cyfrowa jest poprawnym PESELem.

Aby sprawdzić czy dany PESEL jest prawidłowy należy wykonać następujące działania:

Pierwszą cyfrę mnożymy przez 1,
drugą cyfrę mnożymy przez 3,
trzecią cyfrę mnożymy przez 7,
czwarta cyfrę mnożymy przez 9,
piątą cyfrę mnożymy przez 1,
szóstą cyfrę mnożymy przez 3,
siódmą cyfrę mnożymy przez 7,
ósmą cyfrę mnożymy przez 9,
dziewiątą cyfrę mnożymy przez 1,
dziesiątą cyfrę mnożymy przez 3,
jedenastą cyfrę mnożymy przez 1.

Tak uzyskane 11 iloczynów dodajemy do siebie. Jeśli ostatnia cyfra tej sumy jest zerem to podany PESEL jest prawidłowy. Przykład dla numeru PESEL 44051401458

4*1 + 4*3 + 0*7 + 5*9 + 1*1 + 4*3 + 0*7 + 1*9 + 4*1 + 5*3 + 8*1 = 4 + 12 + 0 + 45 + 1 + 12 + 0 + 9 + 4 + 15 + 8 = 110

6. Napisz program zamieniający liczbę na słowną reprezentację np. 1 -> jeden, 11 -> jedenaście, 111 -> sto jedenaście
(Może być w innym języku)

Zadania pochodzą (w większości) ze strony https://pl.spoj.com/problems/latwe/all/lang=JAVA
Wrzucając tam swój kod zostanie on bardzo szczegółowo przetestowany, polecam ;)
 */


package sda.lekcja08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // zadanie 1
        System.out.println("Zadanie 1");
        int number = 9;
        if (isPrime(number)) {
            System.out.println("Liczba " + number + " jest liczbą pierwszą.");
        } else {
            System.out.println("Liczba " + number + " nie jest liczbą pierwszą.");
        }
        System.out.println();

        // zadanie 2
        System.out.println("Zadanie 2");
        ArrayList<Byte> factorialLast2digits = factorialLast2digits(number);
        System.out.println("Ostatnie dwie cyfry " + number + "! wynoszą " + factorialLast2digits.get(0) + " i " + factorialLast2digits.get(1));
        System.out.println();

        // zadanie 3
        System.out.println("Zadanie 3");
        String word = "Konstantynopolitańczykowianeczka";
        System.out.println("Słowo '" + word + "' bez samogłosek brzmi: " + removeVowels(word));
        System.out.println();

        // zadanie 4
        System.out.println("Zadanie 4");
        String word1 = "żb";
        String word2 = "aaee";
        System.out.println("Miks słów " + word1 + " i " + word2 + " brzmi: " + mixWords(word1, word2));
        System.out.println();

        // zadanie 5
        System.out.println("Zadanie 5");
        long pesel = 9912310123l;
        if(isPeselCorrect(pesel)){
            System.out.println("Podany PESEL jest poprawny.");
        } else {
            System.out.println("Podany PESEL jest niepoprawny.");
        }
        System.out.println();


    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long factorial(int number) {
        if (number < 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static ArrayList<Byte> factorialLast2digits(int number) {
        ArrayList<Byte> result = new ArrayList<>();
        result.add((byte) (factorial(number) % 100 / 10));
        result.add((byte) (factorial(number) % 10));
        return result;
    }

    public static String removeVowels(String word) {
        String result = "";
        char[] wordChar = word.toCharArray();
        ArrayList<Character> wordList = new ArrayList<>();
        for (int i = 0; i < wordChar.length; i++) {
            if (wordChar[i] != 'a' && wordChar[i] != 'o' && wordChar[i] != 'e' && wordChar[i] != 'i' && wordChar[i] != 'u' && wordChar[i] != 'y' && wordChar[i] != 'ą' && wordChar[i] != 'ę') {
                wordList.add(wordChar[i]);
            }
        }
        for (int i = 0; i < wordList.size(); i++) {
            result += wordList.get(i);
        }
        return result;
    }

    public static String mixWords(String word1, String word2) {
        String result = "";
        char[] wordChar1 = word1.toCharArray();
        char[] wordChar2 = word2.toCharArray();
        ArrayList<Character> wordList = new ArrayList<>();
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            wordList.add(wordChar1[i]);
            wordList.add(wordChar2[i]);
        }
        for (int i = 0; i < wordList.size(); i++) {
            result += wordList.get(i);
        }
        return result;
    }

    public static boolean isPeselCorrect(long pesel) {
        String peselString = Long.toString(pesel);
        char[] peselCharArray = peselString.toCharArray();
        if (peselCharArray.length != 11) {
            return false;
        }
        Integer[] peselIntArray = new Integer[11];
        for (int i = 0; i < peselCharArray.length; i++) {
            peselIntArray[i] = Character.getNumericValue(peselCharArray[i]);
        }
        int result = peselIntArray[0] * 1 + peselIntArray[1] * 3 + peselIntArray[2] * 7 + peselIntArray[3] * 9 + peselIntArray[4] * 1 + peselIntArray[5] * 3 + peselIntArray[6] * 7 + peselIntArray[7] * 9 + peselIntArray[8] * 1 + peselIntArray[9] * 3 + peselIntArray[10] * 1;
        return (result % 10 == 0);
    }
}
