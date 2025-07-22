package faculdade.exerciciosrepetçao;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pessoas, hideal, mideal,peso, s;
        peso=0;
        pessoas=0;
        hideal=0;
        mideal=0;

        while (pessoas<10){
            System.out.println("Qual o seu sexo? \n(1)Masculino \n(2)Feminino");
            s= sc.nextInt();
            System.out.println("Qual o seu peso?");
            peso= sc.nextInt();
            if(peso>=60 && peso<=80 && s==1){
                hideal=hideal+1;
            }
            if(peso>=50 && peso<=70 && s==2){
                mideal=mideal+1;
            }
            pessoas=pessoas+1;
        }
        System.out.println("Numero de homens com peso entre 60 e 80: "+hideal);
        System.out.println("Numero de mulheres com peso entre 50 e 70: "+mideal);
    }
}
