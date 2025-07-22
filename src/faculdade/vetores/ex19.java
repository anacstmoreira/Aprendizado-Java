package faculdade.vetores;
import java.util.Scanner;
public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] codigos = {101, 202, 303, 404, 505};
        int procurado = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == procurado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Código encontrado");
        } else {
            System.out.println("Código não encontrado");
        }
    }
}
