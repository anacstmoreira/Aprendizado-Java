package faculdade.exerciciosrepetçao;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boi, peso, somapeso, boigordo, boimagro, nmagro, ngordo;
        double media;
        boi=0;
        peso=0;
        somapeso=0;
        boigordo=0;
        boimagro=0;
        ngordo=0;
        nmagro=0;

        while(boi<90){
            System.out.println("Qual o peso do boi "+boi+"?");
            peso= sc.nextInt();
            System.out.println("-----------------------------------");
            if(boi==0){
                boimagro=peso;
                nmagro=boi;
            }
            if(peso>boigordo){
                boigordo=peso;
                ngordo=boi;
            }
            if(peso<boimagro){
                boimagro=peso;
                nmagro=boi;
            }
            somapeso=somapeso+peso;
            boi=boi+1;
        }
        media=somapeso/90;
        System.out.println("Numero do boi mais gordo: "+ ngordo);
        System.out.println("Peso do boi mais gordo: "+ boigordo);
        System.out.println("-----------------------------------");
        System.out.println("Numero do boi mais magro: "+ nmagro);
        System.out.println("Peso do boi mais magro: "+ boimagro);
        System.out.println("-----------------------------------");
        System.out.printf("Media do peso dos bois: %.2f",media);
    }
}