package faculdade.exercicioscondicionais;
import java.util.*;
public class EDS1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double qnt_mc, valormenos12, valormais12, calculo;

        System.out.println("Quantas maças voce quer comprar?");
        qnt_mc= sc.nextDouble();
        valormenos12= 1.30;
        valormais12= 1.00;

        if (qnt_mc<12){
            calculo= qnt_mc*valormenos12;
            System.out.printf("O valor a pagar eh: R$ %.2f", calculo);
        }
        else if (qnt_mc>=12){
            calculo= qnt_mc*valormais12;
            System.out.printf("O valor a pagar eh: R$ %.2f", calculo);
        }
        else{
            System.out.print("Quantidade invalida");
        }
    }
}