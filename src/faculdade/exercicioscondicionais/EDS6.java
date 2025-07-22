package faculdade.exercicioscondicionais;
import java.util.*;
public class EDS6{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int idade= sc.nextInt();
        if (idade>0 && idade<18){
            System.out.println("Voce ainda é menor de idade.");
        }
        else{
            System.out.print("Voc é maior de idade.");
        }
    }
}