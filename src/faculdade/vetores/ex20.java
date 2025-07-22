package faculdade.vetores;
import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[10];

        for (int i = 0; i < precos.length; i++) {
            precos[i] = sc.nextDouble();
        }

        for (int i = 0; i < precos.length - 1; i++) {
            for (int j = i + 1; j < precos.length; j++) {
                if (precos[i] > precos[j]) {
                    double temp = precos[i];
                    precos[i] = precos[j];
                    precos[j] = temp;
                }
            }
        }

        for (int i = 0; i < precos.length; i++) {
            System.out.println(precos[i]);
        }
    }
}
