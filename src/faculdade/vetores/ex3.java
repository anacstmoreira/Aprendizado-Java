//Escreva um programa em java que crie um vetor com 10 números inteiros aleatórios e depois calcule a média dos elementos deste vetor.
package faculdade.vetores;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros= new int[10];
        int soma=0;
        double media= 0;

        System.out.println("Escreva 10 valores inteiros:");
        for(int i=0; i< numeros.length; i++){
            numeros[i]= sc.nextInt();
            soma= soma+numeros[i];
        }
        media=soma/numeros.length;
        System.out.println("A media dos valores do vetor é: " + media);
    }
}
