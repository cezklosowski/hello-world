import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();
        if(number % 10 == 0 & number % 3 == 0){
            System.out.println("Liczba jest podzielna przez 10 i przez 3");
        } else {
            System.out.println("Liczba nie jest podzielna przez 10 lub nie jest podzielna przez 3");
        }
    }
}
