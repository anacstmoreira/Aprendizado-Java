package faculdade.exerciciossequenciais;

import java.util.*;
public class exercicio8 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o código de um item 1, a quantidade, e o valor em uma linha:");
        int item1 = scanner.nextInt();
        int quant_i1= scanner.nextInt();
        double valor1= scanner.nextDouble();
        double calculo= quant_i1*valor1;
        System.out.println("Digite o código de um item 2, a quantidade, e o valor em uma linha:");
        int item2 = scanner.nextInt();
        int quant_i2= scanner.nextInt();
        double valor2= scanner.nextDouble();
        double calculo2= quant_i2*valor2;
        double resultado= calculo+calculo2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado);
    }
}
