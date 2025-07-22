//Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre os números primos e suas respectivas posições.
package faculdade.vetores;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros= new int[10];

        System.out.println("Coloque 10 valores inteiro:");
        for(int i = 0; i< numeros.length; i++){
            numeros[i]= sc.nextInt();
        }
        for(int i=0; i< numeros.length; i++){
            int numero= numeros[i];
            boolean primo= true;

            if(numero<=1){
                primo= false;
            } else {
                for(int j=2; j<numero; j++){
                    if(numero % j==0){
                        primo=false;
                        break;
                    }
                }
            }if (primo) {
                System.out.println("Número primo: (" + numero + ") na posição: (" + i + ")");
            }
        }
    }
}
