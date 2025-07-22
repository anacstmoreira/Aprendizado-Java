package faculdade.exerciciosclasses;

import java.util.*;

public class FaturaTeste01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Qual o numero do item?");
        int itemnumero= sc.nextInt();
        sc.nextLine();
        System.out.print("Qual a descricao do item?\n");
        String descricao= sc.nextLine();
        System.out.println("Qual a quantidade do item?");
        int quantitem= sc.nextInt();
        System.out.println("Qual o valor do item?");
        double valor= sc.nextDouble();

        Fatura fatura = new Fatura(itemnumero,descricao,quantitem,valor);

        double total_fatura= fatura.calcularValor(fatura.getQuant_item(), fatura.getValor_item());

        fatura.imprime();
        System.out.printf("\nO valor total eh: R$%.2f",total_fatura);
    }
}

