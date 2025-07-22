package faculdade.vetores;
import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[10];
        double soma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = sc.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / temperaturas.length;
        System.out.println("Temperatura média: " + media);
    }
}
