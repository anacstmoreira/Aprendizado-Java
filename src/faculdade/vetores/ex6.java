//Escreva um programa em java que preencha um vetor com 30 números inteiros aleatórios entre 1 e 100.
//Peça ao usuário para digitar um valor, verifique se este valor existe no vetor e remova ele do vetor.
package faculdade.vetores;
import java.util.*;
import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[30];
        Random gerador = new Random();
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = gerador.nextInt(100) + 1;
        }
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }

        System.out.println("\nDigite um número de 1 a 100:");
        int numero = sc.nextInt();
        int[] novoVetor = new int[30];
        int j = 0;

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != numero) {
                novoVetor[j] = vetor1[i];
                j++;
            }
        }

        System.out.println("Vetor após remoção:");
        for (int i = 0; i < j; i++) {
            System.out.print(novoVetor[i] + " ");

        }
    }
}