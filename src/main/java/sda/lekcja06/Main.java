package sda.lekcja06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        // zadanie 1
        System.out.println("Zadanie 1");
        System.out.println("Podaj słowo: ");
        Scanner myScanner = new Scanner(System.in);
        String string = myScanner.nextLine();
        boolean isPalindrom = isPalindrom(string);
        if (isPalindrom) {
            System.out.println("Słowo '" + string + "' jest palidromem.");
        } else {
            System.out.println("Słowo '" + string + "' nie jest palindromem.");
        }
        System.out.println();
         */

        /*
        // zadanie 2
        System.out.println("Zadanie 2");
        System.out.println("Podaj pierwsze słowo: ");
        Scanner myScanner = new Scanner(System.in);
        String string1 = myScanner.nextLine();
        System.out.println("Podaj drugie słowo: ");
        String string2 = myScanner.nextLine();
        boolean isAnagram = isAnagram(string1, string2);
        if (isAnagram) {
            System.out.println("Słowa '" + string1 + "' i '" + string2 + "' są anagramami.");
        } else {
            System.out.println("Słowa '" + string1 + "' i '" + string2 + "' nie są anagramami.");
        }
        */

        /*
        // zadanie 3
        System.out.println("Zadanie 3");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz sprawdzić: ");
        int numbers = myScanner.nextInt();
        int[] tab = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            System.out.println("Podaj liczbę nr " + (i+1) + ": ");
            tab[i] = myScanner.nextInt();
        }
        System.out.println("Największa liczba to: " + max(tab));
        System.out.println();
        */

        /*
        // zadanie 3 ver 2

        System.out.println("Zadanie 3");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz sprawdzić: ");
        int numbers = myScanner.nextInt();
        if (numbers > 0) {
            System.out.println("Podaj liczbę nr 1: ");
            int max = myScanner.nextInt();
            for (int i = 1; i < numbers; i++) {
                System.out.println("Podaj liczbę nr " + (i + 1) + ": ");
                int a = myScanner.nextInt();
                max = Math.max(max, a);
            }
            System.out.println("Największa liczba to: " + max);
        } else {
            System.out.println("Liczb musi być więcej niż 0!");
        }
        */

        /*
        // zadanie 4
        System.out.println("Zadanie 4");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj wymiary prostokąta.");
        System.out.println("Pierwszy bok: ");
        int a = myScanner.nextInt();
        System.out.println("Drugi bok: ");
        int b = myScanner.nextInt();
        rectangle(a, b);
        */

        /*
        // Zadanie 5
        System.out.println("Zadanie 5");
        System.out.println(getFactorial(3));
        */


    }

    // Z1: Stwórz metodę sprawdzającą czy podane do niej słowo jest palindromem.
    public static boolean isPalindrom(String string) {
        char[] stringArray = string.toCharArray();
        String reversedString = "";
        for (int i = 0; i < stringArray.length; i++) {
            reversedString += stringArray[stringArray.length - 1 - i];
        }
        string = string.replace(" ", "");
        reversedString = reversedString.replace(" ", "");
        return string.equalsIgnoreCase(reversedString);
    }

    //  Z2: Stwórz metodę sprawdzającą czy podane do niej słowo jest anagramem.
    public static boolean isAnagram(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        char[] tab1 = string1.toCharArray();

        for (int i = 0; i < tab1.length; i++) {
            string2 = string2.replaceFirst(Character.toString(tab1[i]), "");
        }
        return (string2.isEmpty());
    }

    // Z3: Stwórz metodę zwracającą największą liczbę spośród liczb podanych przez użytkownika
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }

    // Z4: Narysuj prostokąt z gwiazdek o wymiarach podanych przez użytkownika
    public static void rectangle(int a, int b) {
        for (int j = 0; j < b; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i < a - 1; i++) {
            System.out.print("*");
            for (int j = 1; j < b - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }
        for (int j = 0; j < b; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Z5: Silnia rekurencyjnie
    public static int getFactorial(int n){
        if (n <= 1){
            return 1;
        }
        return n*getFactorial(n-1);
    }



}
