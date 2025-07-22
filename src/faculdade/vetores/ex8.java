package faculdade.vetores;
import java.util.Random;
public class ex8 {
    public static void main(String[] args) {
        int[] A = new int[15];
        int[] B = new int[15];
        Random rand = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(100);
        }

        for (int i = 0; i < B.length; i++) {
            B[i] = A[A.length - 1 - i];
        }

        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
