package faculdade.exercicioscondicionais;
import java.util.*;
public class EDS8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.println("Informe dois números:");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        System.out.println("------MENU------");
        System.out.println("1-SOMAR\n2-SUBTRAIR\n3-MULTIPLICAR\n4-DIVIDIR\n5-SAIR");
        System.out.println("Escolha uma das opçoes por numero:");
        int menud= sc.nextInt();
        switch (menud){
            case 1:
                resultado= numero1+numero2;
                System.out.print("RESULTADO:"+ resultado);
                break;
            case 2:
                resultado= numero1-numero2;
                System.out.print("RESULTADO:"+ resultado);
                break;
            case 3:
                resultado= numero1*numero2;
                System.out.print("RESULTADO:"+ resultado);
                break;
            case 4:
                resultado= numero1/numero2;
                System.out.printf("RESULTADO:"+ resultado);
                break;
            case 5:
                System.out.print("Encerrando");
                break;
        }
    }
}