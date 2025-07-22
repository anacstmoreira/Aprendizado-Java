package faculdade.exerciciosrepetçao;
import java.util.*;
public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador,matricula, nota, maiornota1, maiornota2, matricula1, matricula2;
        matricula2=0;
        maiornota1=0;
        matricula1=0;
        maiornota2=0;
        contador=0;
        while(contador<100){
            System.out.println("Matricula do Aluno "+contador);
            matricula=sc.nextInt();
            System.out.println("Nota do Aluno "+contador);
            nota= sc.nextInt();
            System.out.println("-------------------");
            if(contador==0){
                maiornota1=nota;
                matricula1=matricula;
            }
            if (nota > maiornota1) {
                maiornota2 = maiornota1;
                matricula2 = matricula1;

                maiornota1 = nota;
                matricula1 = matricula;
            } else if (nota>maiornota2 && nota<maiornota1) {
                maiornota2 = nota;
                matricula2 = matricula;
            }
            contador=contador+1;
            }
        System.out.println("Melhor nota foi: "+maiornota1);
        System.out.println("Matricula: "+matricula1);
        System.out.println("---------------------------");
        System.out.println("Segunda melhor nota foi: "+maiornota2);
        System.out.println("Matricula: "+matricula2);
        }
    }