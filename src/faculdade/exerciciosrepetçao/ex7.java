package faculdade.exerciciosrepetçao;
import java.util.*;
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alunos;
        double media, soma, nota, maior, menor;
        alunos = 0;
        maior= 0;
        menor= 0;
        nota= 0;
        soma= 0;
        media=0;
        while (alunos < 5) {
            System.out.println("Digite a nota do Aluno "+alunos);
            nota = sc.nextInt();
            if (alunos==0){
                menor=nota;
            }
            if (nota > maior) {
                maior = nota;
            }
            if (nota<menor) {
                menor=nota;
            }
            soma= soma+nota;
            media= soma/alunos;
            alunos=alunos+1;
        }
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        System.out.println("Media: "+media);
    }
}
