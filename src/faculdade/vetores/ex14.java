package faculdade.vetores;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int etapas = sc.nextInt();
        int tempo = etapas * 5;
        System.out.println("Tempo total: " + tempo + " minutos");
    }
}
