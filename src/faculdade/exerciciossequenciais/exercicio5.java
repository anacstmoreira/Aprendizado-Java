package faculdade.exerciciossequenciais;

import java.util.*;
public class exercicio5 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int A, B, C, D, DIFERENCA;
        A= scanner.nextInt();
        B= scanner.nextInt();
        C= scanner.nextInt();
        D= scanner.nextInt();
        DIFERENCA= (A*B)-(C*D);
        System.out.println("DIFERENCA = "+ DIFERENCA);
    }
}
