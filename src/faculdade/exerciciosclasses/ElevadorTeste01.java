package faculdade.exerciciosclasses;

import java.util.Scanner;

public class ElevadorTeste01 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Quantos andares tem o prédio?");
        int total_andares= sc.nextInt();
        System.out.println("Qual a capacidade do elevador?");
        int capacidade= sc.nextInt();
        Elevador elevador1= new Elevador(total_andares, capacidade);
        elevador1.menu();

    }
}
