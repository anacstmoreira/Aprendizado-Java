package faculdade.exercicioscondicionais;
import java.util.*;
public class EDS4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double dureza, teor, resistencia;
        boolean dureza1, teor1, resistencia1;
        System.out.println("Coloque a dureza do carvão:");
        dureza = sc.nextDouble();
        System.out.println("Coloque o teor do carvão:");
        teor = sc.nextDouble();
        System.out.println("Coloque a resistencia do carvão:");
        resistencia = sc.nextDouble();
        dureza1= false;
        teor1= false;
        resistencia1= false;

        if(dureza>50){
            dureza1 = true;
        }
        if(teor<0.7){
            teor1 = true;
        }
        if(resistencia>5600){
            resistencia1 = true;
        }

        if (dureza1 && teor1 && resistencia1) {
            System.out.println("A pontuação é 10!!");
        }
        else if (dureza1 && teor1 && !resistencia1) {
            System.out.println("A pontuação é 9!!");
        }
        else if (!dureza1 && teor1 && resistencia1) {
            System.out.println("A pontuação é 8!!");
        }
        else if (dureza1 && !teor1 && resistencia1) {
            System.out.println("A pontuação é 7!!");
        }
        else if ((dureza1 && teor1 && !resistencia1) ||
                (!teor1 && !dureza1 && !resistencia1) ||
                (resistencia1 && !dureza1 && teor1)) {
            System.out.println("A pontuação é 6!!");
        }
        else{
            System.out.println("A pontuaçao é 5!!");
        }
    }
}