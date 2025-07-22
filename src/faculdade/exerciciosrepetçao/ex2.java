package faculdade.exerciciosrepetçao;
import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, contsal,mediasal, mediafil;
        int nfilhos, contfilhos, conthab;
        contsal=0;
        contfilhos=0;
        conthab= 0;
        salario= 0;
        nfilhos= 0;
        mediasal= 0;
        mediafil= 0;

        while (salario>=0){
            System.out.println("Qual o seu salario?");
            salario= sc.nextDouble();

            if (salario<0){
                break;
            }

            System.out.println("Quantos filhos voce tem?");
            nfilhos= sc.nextInt();
            conthab=conthab+1;

            if (nfilhos>0){
                contfilhos=contfilhos+nfilhos;
            }
            if (salario>0){
                contsal=contsal+salario;
            }

            mediafil= contfilhos/conthab;
            mediasal= contsal/conthab;
        }
        System.out.printf("Media de salario da populacao: %.2f",mediasal);
        System.out.printf("\nMedia de filhos da populacao: %.2f",mediafil);

    }
}
