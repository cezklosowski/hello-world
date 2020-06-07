package sda.lekcja07;

public class BinarySearch {
    public static int search(int[] ints, int number) {
        // 2
        int left = 0;
        // 3
        int right = ints.length;
        while (true) {
            // 4
            int middle = (left + right) / 2;
            // 5
            if (left > right) {
                return -1;
            }
            // 6
            if (ints[middle] == number) {
                return middle;
            } else if (ints[middle] > number) { // 7
                right = middle - 1;
            } else if (ints[middle] < number) { // 8
                left = middle + 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] ints2 = {0, 1, 2, 3, 4, 6, 5, 7, 8, 9};
        BubbleSort bubbleSort = new BubbleSort();
        ints2 = bubbleSort.bubbleSort(ints2);
        int result = BinarySearch.search(ints2, 7);
        System.out.println("Pozycja: " +
                result +
                ", wartosc: " +
                ints2[result]);
    }
}
