import java.util.Scanner;

public class Petle {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        while(true){
            System.out.println("Podaj komendę: ");
            String komenda = myScanner.nextLine();

            if (komenda.equals("exit")){
                System.out.println("Kończę działanie pętli, żegnam.");
                break;
            } else{
                System.out.println("Podałeś komendę: " + komenda);
                System.out.println("Działamy dalej.");
            }
        }
    }
}
