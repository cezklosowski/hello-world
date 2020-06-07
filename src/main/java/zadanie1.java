import java.util.Scanner;

public class zadanie1 {

    public static void main(String[] args) {
        System.out.println("Podaj pierwszą liczbę: ");
        Scanner myScanner = new Scanner(System.in);
        int number1 = myScanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int number2 = myScanner.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int number3 = myScanner.nextInt();
        if (number1 == 1) {
            System.out.println(number2+number3);
        }
        if (number1 == 2) {
            System.out.println(number2*number3);
        }
        if (number1 == 3) {
            System.out.println(number2-number3);
        }
    }
}
