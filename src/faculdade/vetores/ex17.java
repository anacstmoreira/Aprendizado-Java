package faculdade.vetores;
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("Média: " + media);
    }
}
