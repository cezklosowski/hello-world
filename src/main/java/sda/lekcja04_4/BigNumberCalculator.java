package sda.lekcja04_4;

import java.util.ArrayList;
import java.util.List;

public class BigNumberCalculator{

    public static BigNumber add(BigNumber number1, BigNumber number2){
        BigNumber score = new BigNumber();

        BigNumber a = new BigNumber(number1);
        BigNumber b = new BigNumber(number2);

        if (a.isSign() == true && b.isSign() == true) {
            // dodawanie

            // zrównanie długości
            int maxLength = Math.max(a.getNumber().size(), b.getNumber().size());
            if (a.getNumber().size() < maxLength) {
                for (int i = 0; i < (maxLength - a.getNumber().size()); i++) {
                    a.getNumber().add((short) 0);
                }
            }
            if (b.getNumber().size() < maxLength) {
                for (int i = 0; i < (maxLength - b.getNumber().size()); i++) {
                    b.getNumber().add((short) 0);
                }
            }

            score.setSign(true);
            short toRemember = 0;

            for (int i = 0; i < maxLength; i++) {


                score.getNumber().add((short) (a.getNumber().get(i) + b.getNumber().get(i)));
                if (score.getNumber().get(i) > 1000) {
                    score.getNumber().set(i, (short) (score.getNumber().get(i) - 1000));
                    toRemember++;
                }
                if (toRemember != 0) {
                    // jeżeli to ostatnia potęga i trzeba rozszerzyć listę
                    if (i == Math.max(a.getNumber().size(), b.getNumber().size()) - 1) {
                        System.out.println("tu");
                        score.getNumber().add((short) toRemember);
                        toRemember--;
                    } else {
                        // dodanie 1 do kolejnej pozycji
                        score.getNumber().set(i, (short) (score.getNumber().get(i) + toRemember));
                        toRemember--;
                    }
                }
            }
        }

        if (a.isSign() == true && b.isSign() == false) {
            b.setSign(true);
            score = substract(a,b);
        }

        if (a.isSign() == false && b.isSign() == true) {
            a.setSign(true);
            score = substract(b,a);
        }
        if (a.isSign() == false && b.isSign() == false) {
            a.setSign(true);
            b.setSign(true);
            score = substract(b,a);
        }

        return score;
    }

    public static BigNumber substract(BigNumber number1, BigNumber number2) {
        BigNumber score = new BigNumber();
        BigNumber a = new BigNumber(number1);
        BigNumber b = new BigNumber(number2);

        // ustalenie znaku

        // zrównanie długości

        int maxLength = Math.max(a.getNumber().size(), b.getNumber().size());
        if (a.getNumber().size() < maxLength) {
            for (int i = 0; i < (maxLength - a.getNumber().size()); i++) {
                a.getNumber().add((short) 0);
            }
        }
        if (b.getNumber().size() < maxLength) {
            for (int i = 0; i < (maxLength - b.getNumber().size()); i++) {
                b.getNumber().add((short) 0);
            }
        }


        // gdy a > b i gdy a > 0 i b > 0

        if ((a.getNumber().get(a.getNumber().size() - 1)) > (b.getNumber().get(b.getNumber().size() - 1)) && a.isSign() == true && b.isSign() == true) {

            for (int i = 0; i < maxLength; i++) {
                if ((a.getNumber().get(i) - b.getNumber().get(i)) < 0) {
                    score.getNumber().add((short) (1000 + a.getNumber().get(i) - b.getNumber().get(i)));
                    a.getNumber().set(i + 1, (short) (a.getNumber().get(i + 1) - 1));
                } else {
                    score.getNumber().add((short) (a.getNumber().get(i) - b.getNumber().get(i)));
                }
            }


            score.setSign(true);
        }

        // gdy a < b  i gdy a > 0 i b > 0

        if ((a.getNumber().get(a.getNumber().size() - 1)) < (b.getNumber().get(b.getNumber().size() - 1)) && (a.isSign() && b.isSign())) {
            score = substract(b,a);
            score.setSign(false);
        }

        // gdy a > b i gdy a > 0 i b < 0
        // tu nie działa, bo chcę przekierować na dodawanie, a liczba ma znak ujemny, co nie wchodzi w warunek dodawania;

        if ((a.getNumber().get(a.getNumber().size() - 1)) > (b.getNumber().get(b.getNumber().size() - 1)) && (a.isSign() && !b.isSign())) {
           // oszukanie znaku b
            b.setSign(true);
            score = add(a,b);
        }


        return score;
    }


}
