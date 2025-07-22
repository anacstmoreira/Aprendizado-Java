package faculdade.exercicioscondicionais;
import java.util.Scanner;
public class EDS11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C;
        System.out.println("Coloque valores para A, B, e C:");
        A= sc.nextInt();
        B= sc.nextInt();
        C= sc.nextInt();
        if(A+B>C && A+C>B && B+C>A){
            if(A==B && B==C){
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if(A==B || B==C || C==A){
                System.out.println("TRIANGULO ISOSCELES");
            }
            else{
                System.out.println("TRIANGULO ESCALENO");
            }
        }
        else{
            System.out.println("Não eh possivel fazer um triangulo.");
        }
        sc.close();
    }
}

