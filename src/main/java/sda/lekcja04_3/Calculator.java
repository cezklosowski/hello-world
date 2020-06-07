package sda.lekcja04_3;

public class Calculator {

    // add
    public static int add(int i, int j) {
        for (int k = 0; k < j; k++) {
            i++;
        }
        return i;
    }

    // substract
    public static int substract(int i, int j) {
        for (int k = 0; k < j; k++) {
            i--;
        }
        return i;
    }

    // multiply
    public static int multiply(int i, int j) {
        int score = i;
        for (int k = 0; k < j - 1; k++) {
            for (int l = 0; l < i; l++) {
                score++;
            }
        }
        return score;
    }

    // divide
    public static int divide(int i, int j) {
        int score = 0;
        int actual = i;
        for (int k = 0; k < i; k++) {
            actual = substract(actual, j);
            if (actual >= 0) {
                score++;
            }
        }
        return score;
    }

    // pow
    public static int pow(int i, int j) {
        int score = i;
        for (int k = 0; k < j - 1; k++) {
            score = multiply(score, i);
        }
        return score;
    }
}
