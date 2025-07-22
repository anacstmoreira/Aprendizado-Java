package faculdade.vetores;
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        double[] numeros = new double[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }

        double maior = numeros[0];
        double menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
