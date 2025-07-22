package faculdade.exerciciossequenciais;

import java.util.*;
public class exercicio6 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int nfuncionario, salahora;
        double horastrab;
        nfuncionario= scanner.nextInt();
        salahora= scanner.nextInt();
        horastrab= scanner.nextDouble();
        System.out.println("NUMBER = "+ nfuncionario);
        System.out.println("SALARY = US "+ salahora*horastrab);
    }
}
