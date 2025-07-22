package faculdade.exerciciosrepetçao;

import java.util.*;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim;
        inicio=1;
        System.out.println("Coloque um numero limite:");
        fim= sc.nextInt();
        while(inicio<fim){
            if(inicio%2!=0){
                System.out.println(inicio);
            }
            inicio=inicio+1;
        }
    }
}


