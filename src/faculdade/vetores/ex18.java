package faculdade.vetores;
import java.util.Scanner;
public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[8];
        double maior = -9999;

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = sc.nextDouble();
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }

        System.out.println("Maior temperatura: " + maior);
    }
}
