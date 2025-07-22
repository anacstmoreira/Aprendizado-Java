package faculdade.exercicioscondicionais;
import java.util.*;
public class EDS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o numero da sua conta:");
        int conta= sc.nextInt();
        System.out.println("Coloque o seu saldo:");
        double saldo= sc.nextDouble();
        System.out.println("Coloque o seu debito:");
        double debito= sc.nextDouble();
        System.out.println("Coloque o seu credito:");
        double credito= sc.nextDouble();

        double saldo_atual= saldo-debito+credito;
        if (saldo_atual>=0){
            System.out.printf("O seu saldo atual é: R$ %.2f", saldo_atual);
            System.out.println("\nSaldo positivo");
        }
        else{
            System.out.printf("O seu saldo atual é: R$ %.2f", saldo_atual);
            System.out.println("\nSaldo negativo");
        }
    }
}
