package sda.lekcja05;
/*
napisać metodę statyczną która przyjmie liczbę n i wypiszę ciąg Fiboonaciego długości n
 */

/*
8.Sprawdź, czy podany ciąg liczb jest ciągiem arytmetycznym
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = fibbonaci(21);
        System.out.println(list);

        int[] tab = {1, 2, 3, 4, 5};
        System.out.println(isArithmetic(tab));
    }

    public static List<Integer> fibbonaci(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i < n; i++) {
            list.add((list.get(i - 2)) + (list.get(i - 1)));
        }
        return list;
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
}
