package faculdade.exerciciossequenciais;

import java.util.*;
public class exercicio7 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String nome= scanner.next();
        double salario= scanner.nextDouble();
        double vendas= scanner.nextDouble();
        double calculo= salario+(vendas*0.15);
        System.out.printf("TOTAL = R$ %.2f", calculo);
    }
}
