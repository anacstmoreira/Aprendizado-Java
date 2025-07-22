package faculdade.vetores;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] respostas = new int[5];

        for (int i = 0; i < respostas.length; i++) {
            respostas[i] = sc.nextInt();
        }

        for (int i = respostas.length - 1; i >= 0; i--) {
            System.out.println(respostas[i]);
        }
    }
}
