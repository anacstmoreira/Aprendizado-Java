package faculdade.exerciciosrepetçao;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp, media, tempquant;
        int quant;
        quant=0;
        tempquant=0;
        while(quant<10){
            System.out.println("Dia "+quant);
            System.out.println("Qual a temperatura de hoje?");
            temp=sc.nextDouble();

            if (temp>0){
                tempquant=tempquant+temp;
            }
            quant=quant+1;
        }
        media= tempquant/quant;
        System.out.printf("Media da temperatura: %.2f", media);
    }
}
