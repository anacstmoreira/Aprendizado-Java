package faculdade.exercicioscondicionais;
import java.util.*;
public class EDS7 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int idade;
        System.out.println("Qual sua idade?");
        idade= sc.nextInt();
        if(idade>=0 && idade<=7){
        System.out.println("INFANTIL");
        }
        else if(idade>=8 && idade<=10){
            System.out.print("JUNEVIL");
        }
        else if(idade>=11 && idade<=15){
            System.out.print("ADOLESCENTE");
        }
        else if(idade>=16 && idade<=30){
            System.out.print("ADULTO");
        }
        else{
            System.out.print("SENIOR");
        }
    }
}
