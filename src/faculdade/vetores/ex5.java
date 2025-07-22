//Escreva um programa em java que preencha um vetor com 15 números inteiros aleatórios entre 1 e 50.
//Verifique se o número 20 existe nesse vetor e retorne seu índice caso ele exista.
package faculdade.vetores;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];

        System.out.println("Escreva 15 valores entre 1 e 50:");
        for (int i = 0; i < numeros.length; i++) {
            while (true) {
                int valor = sc.nextInt();
                if (valor >= 1 && valor <= 50) {
                    numeros[i] = valor;
                    break;
                } else {
                    System.out.println("Número inválido! Digite entre 1 e 50.");
                }
            }
        }
        boolean vinte= false;
        int indice= 0;
        for(int i=0;i< numeros.length; i++){
            if(numeros[i]==20){
                vinte=true;
                indice= i;
                break;
            }
        }
        if(vinte){
            System.out.println("Há o numero 20 no indice ("+ indice + ") e posiçao ("+ (indice+1) +")");
        }else{
            System.out.println("Nao há o numero 20!");
        }
    }
}

