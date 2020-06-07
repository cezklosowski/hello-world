package sda.lekcja07;

import java.util.Arrays;
public class BubbleSort {
    public int[] bubbleSort(int[] ints) {
        int counter = 0;
        int length = ints.length;
        boolean flag;
        for (int i = 0; i < length; i++) {
            flag = false;
            for (int j = 0; j < length - 1 - i; j++) {
                counter++;
                if (ints[j] > ints[j + 1]) {
                    int tmp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = tmp;
                    flag = true;
                }
            }
            if(!flag) {
                System.out.println(counter);
                return ints;
            }
        }
        System.out.println(counter);
        return ints;
    }
    public static void main(String[] args) {
        int[] ints = {5, 3, 7, 9, 2, 6, 1, 8, 0, 4};
        int[] ints2 = {0, 1, 2, 3, 4, 6, 5, 7, 8, 9};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(
                Arrays.toString(
                        bubbleSort.bubbleSort(ints2)
                )
        );
    }
}

