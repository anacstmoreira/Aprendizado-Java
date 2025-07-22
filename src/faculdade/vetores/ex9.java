package faculdade.vetores;
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        int i = 1;

        while (i <= quantidade) {
            System.out.println("Recibo " + i);
            i++;
        }
    }
}
