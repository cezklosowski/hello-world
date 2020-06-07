
public class Petle2 {
    public static void main(String[] args) {
        // pętla for
        for (int i = 0; i <= 50; i++){
            if (i % 10 != 0) {
                System.out.println(i);
            }
        }

        // pętla while
        int i = 0;
        while (i <= 50){
            if (i % 10 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
