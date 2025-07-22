package faculdade.exerciciosrepetçao;
import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, contador, dobro;
        valor=0;
        dobro=0;
        contador=0;
        while(contador<5){
            System.out.println("Coloque um valor:");
            valor= sc.nextInt();
            dobro= valor*2;
            System.out.println("Dobro do valor: "+ dobro);
            System.out.println("-----------------------------");
            contador=contador+1;
        }
    }
}
