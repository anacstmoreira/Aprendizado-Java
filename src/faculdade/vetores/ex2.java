//Faça um programa que preencha dois faculdade.vetores de dez elementos numéricos cada um e mostre o vetor resultante da intercalação deles.
package faculdade.vetores;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        System.out.println("Preencha o primeiro vetor com 10 valores:");
        for(int i=0; i< vetor1.length; i++){
            vetor1[i]= sc.nextInt();
        }
        System.out.println("Preencha o segundo vetor com 10 valores:");
        for(int i=0; i< vetor2.length; i++){
            vetor2[i]= sc.nextInt();
        }

        int[] vetor3 = new int[20];
        int j = 0;
        for(int i=0; i<10; i++){
            vetor3[j]= vetor1[i];
            j++;

            vetor3[j]= vetor2[i];
            j++;
        }
        for(int i= 0; i< vetor3.length; i++){
            System.out.println(vetor3[i]);
        }
    }
}
