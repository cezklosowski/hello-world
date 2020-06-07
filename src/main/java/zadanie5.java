import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą liczbę: ");
        Scanner myScanner = new Scanner(System.in);
        int number1 = myScanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int number2 = myScanner.nextInt();
        System.out.println();
        if(number1 < number2){
            for (int i = number1; i <= number2; i++){
                System.out.println(i);
            }
        }
    }
}
