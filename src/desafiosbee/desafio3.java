package desafiosbee;
import java.util.Scanner;
public class desafio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int caminhoes, quantmotoristas;
        double areiacaminhao, salariomotorista;
        String decisao, decisao2;
        decisao="";
        decisao2="sim";

        System.out.println("Quer iniciar o programa?");
        decisao= sc.next().trim().toLowerCase();
        if(decisao.equals("sim")){
            while(decisao2.equals("sim")){
                System.out.println("Qual a quantidade de caminhoes na empresa?");
                caminhoes= sc.nextInt();
                System.out.println("Qual a media de areia por caminhão?");
                areiacaminhao= sc.nextInt();
                System.out.println("Qual a quantidade de motoristas por caminhao?");
                quantmotoristas= sc.nextInt();
                System.out.println("Qual o salario de cada motorista?");
                salariomotorista= sc.nextInt();

                int totalfun = caminhoes * quantmotoristas;
                double salariototal = (totalfun * salariomotorista) * 12;
                double mediaareia = (caminhoes * areiacaminhao) / 12;

                System.out.println("O total de funcionários é: " + totalfun);
                System.out.println("O total de salário pago ao ano é: " + salariototal);
                System.out.println("A media de areia por ano é: " + mediaareia);

                System.out.println("Você quer utilizar o programa novamente?");
                decisao2= sc.next().trim().toLowerCase();
            }
        }
        else if(decisao.equals("nao")){
            System.out.println("Obrigado por utilizar o programa!");
        }
        else{
            System.out.println("Opção invalida!");
            System.out.println("Você deseja utlizar o programa?");
            decisao= sc.next().trim().toLowerCase();
        }
    }
}