package faculdade.exerciciosrepetçao;
import java.util.*;
public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma, linferior,lsuperior;
        soma=0;
        System.out.println("Coloque um valor para o inicio da contagem:");
        linferior= sc.nextInt();
        System.out.println("Coloque um valor para o fim da contagem:");
        lsuperior= sc.nextInt();
        System.out.println("--------------------");
        while(linferior<lsuperior){
            if(linferior%2==0){
                System.out.println(linferior);
                soma=soma+linferior;
            }
            linferior= linferior+1;
        }
        System.out.println("--------------------");
        System.out.println("Soma dos numeros:"+soma);
    }
}
