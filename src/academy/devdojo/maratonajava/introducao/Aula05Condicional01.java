package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05Condicional01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade= sc.nextInt();
        if(idade<15){
            System.out.println("Infantil");
        } else if (idade>=15 && idade<18) {
            System.out.println("Juvenil");
        } else{
            System.out.println("Adulto");
        }
    }
}
