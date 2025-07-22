package faculdade.exerciciosrepetçao;
import java.util.*;
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma, quant, valor;
        double media;
        soma=0;
        quant=0;
        media=0;
        while(quant<75){
            System.out.println("Rodada "+quant);
            System.out.println("Digite um valor:");
            valor= sc.nextInt();
            System.out.println("--------------------");
            if(valor<0){
                System.out.println("Valor tem que ser positivo!");
                System.out.println("Rodada "+quant);
                System.out.println("Digite um valor:");
                valor= sc.nextInt();
                System.out.println("--------------------");
            }else{
                soma=soma+valor;
            }
            quant=quant+1;
        }
        media= soma/75;
        System.out.println("Quantidade de numeros lidos: "+quant);
        System.out.printf("A media é: %.2f",media);
    }
}