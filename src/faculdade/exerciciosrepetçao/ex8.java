package faculdade.exerciciosrepetçao;
import java.util.*;
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pessoas, idade, peso, peso90, idadem;
        double media;
        peso=0;
        pessoas=0;
        idade=0;
        peso90=0;
        idadem=0;
        while (pessoas<7){
            System.out.println("Qual sua idade?");
            idade= sc.nextInt();
            System.out.println("Qual o seu peso?");
            peso= sc.nextInt();
            System.out.println("---------------------------");
            if(idade>0){
                idadem=idadem+idade;
            }
            if(peso>90){
                peso90=peso90+1;
            }
            pessoas=pessoas+1;
        }
        media= idadem/7;
        System.out.println("Pessoas com mais de 90Kg: "+ peso90);
        System.out.printf("Media da idade: %.2f", media);

    }
}