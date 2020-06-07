// Kolejne proste zadanko: Napisać program, który zczyta z konsoli liczbę naturalną (int) i dwa razy tyle ile wynosi ta liczba !!! wysietla na konsoli napis "Do widzenia".

import java.util.Scanner;

public class Petle3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = myScanner.nextInt();
        System.out.println("");
        for (int i = 0; i < (2*liczba); i++){
            System.out.println("Do widzenia");
        }
    }
}
