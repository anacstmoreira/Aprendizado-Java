//Escreva um programa em java que preencha um vetor com 20 números inteiros aleatórios entre 1 e 30 e depois verifique se o número 25 existe neste vetor.
package faculdade.vetores;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];

        System.out.println("Escreva 20 valores entre 1 e 30:");
        for (int i = 0; i < numeros.length; i++) {
            while (true) {
                int valor = sc.nextInt();
                if (valor >= 1 && valor <= 30) {
                    numeros[i] = valor;
                    break;
                } else {
                    System.out.println("Número inválido! Digite entre 1 e 30.");
                }
            }
        }

        boolean vintecinco= false;
        for(int i=0;i< numeros.length; i++){
            if(numeros[i]==25){
                vintecinco=true;
                break;
            }
        }
        if(vintecinco){
            System.out.println("Há o numero 25!");
        }else{
            System.out.println("Nao há o numero 25!");
        }
    }
}
