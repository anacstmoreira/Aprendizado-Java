package faculdade.exerciciossequenciais;

import java.util.*;
public class exercicio9 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double raio, pi;
        pi = 3.14159;
        raio= scanner.nextDouble();
        double volume= (4*pi*(raio*raio*raio))/3;
        System.out.printf("VOLUME = %.3f",volume);
    }
}
