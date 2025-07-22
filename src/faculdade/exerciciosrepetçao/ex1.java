package faculdade.exerciciosrepetçao;
import java.util.*;
public class ex1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int matricula, n1,n2, n3, media;
        n1=0;
        n2=0;
        n3=0;
        matricula=0;

        while (matricula>=0){
            System.out.println("Matricula:");
            matricula= sc.nextInt();

            if (matricula < 0) {
                break;
            }

            System.out.println("Nota 1:");
            n1= sc.nextInt();
            System.out.println("Nota 2:");
            n2= sc.nextInt();
            System.out.println("Nota 3:");
            n3= sc.nextInt();

            media= n1+n2+n3;

            if (media>=70){
                System.out.println("Aprovado!");
                System.out.println("Media:"+media);
                System.out.println("----------------");
            }
            else if (media>=60) {
                System.out.println("Exame!");
                System.out.println("Media:"+media);
                System.out.println("----------------");
            }
            else if (media<60){
                System.out.println("Reprovado!");
                System.out.println("Media:"+media);
                System.out.println("----------------");
            }

        }
    }
}
