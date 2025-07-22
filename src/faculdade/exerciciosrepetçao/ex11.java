package faculdade.exerciciosrepetçao;
import java.util.*;
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amigos,sexo, quant, quantm, quanth;
        double altura, maior, menor, somaaltura, mediaaltura, somamulher,somahomem, mediamulher, mediahomem;
        String nome, nomemaior,nomemenor;
        maior= 0;
        menor= 0;
        altura= 0;
        amigos=0;
        quanth=0;
        quantm=0;
        somahomem=0;
        somamulher=0;
        somaaltura=0;
        nomemaior= "nada";
        nomemenor= "nada";
        quant=4;

        while (amigos < quant) {
            System.out.println("Digite o seu nome:");
            nome = sc.next();
            System.out.println("Digite o sua altura:");
            altura = sc.nextDouble();
            System.out.println("(1)Masculino (2)Feminino:");
            sexo = sc.nextInt();
            System.out.println("---------------------------");

            if (amigos==0){
                menor=altura;
                nomemenor=nome;
            }
            if (altura > maior) {
                maior = altura;
                nomemaior=nome;
            }
            if (altura<menor) {
                menor=altura;
                nomemenor=nome;
            }
            if(sexo==1){
                somahomem=somahomem+altura;
                quanth=quanth+1;
            }
            if(sexo==2){
                somamulher=somamulher+altura;
                quantm=quantm+1;
            }
            somaaltura=somaaltura+altura;
            amigos=amigos+1;
        }
        mediaaltura=somaaltura/quant;
        mediamulher=somamulher/quantm;
        mediahomem=somahomem/quanth;

        System.out.println("Nome da maior pessoa: " + nomemaior);
        System.out.println("Altura da maior pessoa: " + maior);
        System.out.println("---------------------------");
        System.out.println("Nome da menor pessoa: " + nomemenor);
        System.out.println("Altura da menor pessoa:" + menor);
        System.out.println("---------------------------");
        System.out.printf("Media de altura das mulheres: %.2f",mediamulher);
        System.out.printf("\nMedia de altura dos homens: %.2f",mediahomem);
        System.out.println("---------------------------");
        System.out.printf("\nMedia de altura dos amigos: %.2f",mediaaltura);
        System.out.println("\n---------------------------");
    }
}
