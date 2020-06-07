package sda.lekcja03;

import java.lang.System;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        // pracownicy
        Pracownik p1 = new Pracownik("Adam", "Mazur", 30, "01.01.2010", 15000);
        Pracownik p2 = new Pracownik("Janusz", "Wybicki", 62, "23.02.1972", 43000);
        Pracownik p3 = new Pracownik("Monika", "Sokołowska", 25, "23.09.2020", 9000);
        Pracownik p4 = new Pracownik("Marta", "Kamińska", 41, "30.01.2000", 22000);
        Pracownik p5 = new Pracownik("Michał", "Prezesowski", 18, "01.01.2020", 100000);

        System.out.println(p1.imie + " " + p1.nazwisko + " " + p1.wynagrodzenie);
        // zmiana wynagrodzenia pracownika p1
        p1.wynagrodzenie = 16000;
        System.out.println("Nowe wynagrodzenie pracownika " + p1.imie + " " + p1.nazwisko + " wynosi " + p1.wynagrodzenie);

        // punkty 2D
        Punkt2D A = new Punkt2D(1,1);
        Punkt2D B = new Punkt2D(1,4);
        double score = A.odleglosc(A,B);
        System.out.println("Odległość pomiędzy punktami: ");
        System.out.println("A: " + A.x + " " + A.y);
        System.out.println("B: " + B.x + " " + B.y);
        System.out.println("wynosi: " + score);

        Punkt2D C = new Punkt2D(0,5);
        Punkt2D D = new Punkt2D(-2,5);
        double score2 = C.odleglosc(C,D);
        System.out.println("Odległość pomiędzy punktami: ");
        System.out.println("C: " + C.x + " " + C.y);
        System.out.println("D: " + D.x + " " + D.y);
        System.out.println("wynosi: " + score2);

        // punkty 3D
        Punkt3D E = new Punkt3D(1,2,3);
        Punkt3D F = new Punkt3D(4,1,5);
        Punkt3D G = new Punkt3D(0,6,3);
        System.out.println("E: " + E.toString());
        System.out.println("F: " + F.toString());
        System.out.println("G: " + G.toString());

        // kalkulator
        Kalkulator kalkulator = new Kalkulator();
        int aInt = 4;
        int bInt = 3;
        double aDouble = 4;
        double bDouble = 3;

        int suma1 = kalkulator.dodaj(aInt,bInt);
        System.out.println(suma1);
        double suma2 = kalkulator.dodaj(aDouble,bDouble);
        System.out.println(suma2);
        int roznica1 = kalkulator.odejmij(aInt,bInt);
        System.out.println(roznica1);
        double roznica2 = kalkulator.odejmij(aDouble,bDouble);
        System.out.println(roznica2);
        int iloczyn1 = kalkulator.pomnoz(aInt,bInt);
        System.out.println(iloczyn1);
        double iloczyn2 = kalkulator.pomnoz(aDouble,bDouble);
        System.out.println(iloczyn2);
        int iloraz1 = kalkulator.podziel(aInt,bInt);
        System.out.println(iloraz1);
        double iloraz2 = kalkulator.podziel(aDouble,bDouble);
        System.out.println(iloraz2);

    }
}
