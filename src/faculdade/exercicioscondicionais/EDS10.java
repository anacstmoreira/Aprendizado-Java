package faculdade.exercicioscondicionais;
import java.util.*;
public class EDS10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque seu salario:");
        double salario, salarion;
        salario = sc.nextDouble();
        if(salario>0 && salario<1000.00){
            salarion=salario+(salario*0.30);
            System.out.printf("Seu salário ajustado é: %.2f", salarion);
        }
        else{
            System.out.print("Você não tem direito a esse ajuste.");
        }
    }
}