package faculdade.exerciciossequenciais;

import java.util.*;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double raio, pi, area;
        raio= scanner.nextDouble();
        pi= 3.14159;
        area= pi*(raio*raio);
        System.out.println("A=" + area);
    }
}
