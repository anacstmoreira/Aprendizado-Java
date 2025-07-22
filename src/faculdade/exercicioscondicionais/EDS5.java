package faculdade.exercicioscondicionais;
import java.util.*;
public class EDS5{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double salariomin, salariop, salarios;
        System.out.println("Coloque seu salario:");
        salariop= sc.nextDouble();
        salariomin= 1518;
        if (salariop>salariomin){
            System.out.print("Voce recebe ao menos 1 salario minimo");
        }
        else{
            System.out.print("Voce nao recebe nem 1 salario minimo");
        }
    }
}