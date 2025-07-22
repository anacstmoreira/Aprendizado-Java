package faculdade.exerciciosrepetçao;
import java.util.*;
public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alunos, quant, nota, maior, menor;
        alunos = 0;
        maior= 0;
        menor= 0;
        nota= 0;
        System.out.println("Quantos alunos ha na turma?");
        quant= sc.nextInt();

        while (alunos < quant) {
            System.out.println("Digite a nota do Aluno "+alunos);
            nota = sc.nextInt();
            System.out.println("---------------------------");
            if(nota>=0 && nota<=15){
                if (alunos==0){
                    menor=nota;
                }
                if (nota > maior) {
                    maior = nota;
                }
                if (nota<menor) {
                    menor=nota;
                }
                alunos=alunos+1;
            }else{
                System.out.println("INVALIDO!");
            }

        }
        System.out.println("Maior nota obtida: "+maior);
        System.out.println("Menor nota obtida: "+menor);
    }
}
