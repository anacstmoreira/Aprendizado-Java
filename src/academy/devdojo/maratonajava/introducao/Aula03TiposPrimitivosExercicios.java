package academy.devdojo.maratonajava.introducao;
import java.util.*;
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome= sc.nextLine();
        System.out.println("Qual seu endereço?");
        String endereco= sc.nextLine();
        System.out.println("Qual seu salario?");
        double salario= sc.nextDouble();
        System.out.println("Qual a data de hoje? dd/mm/ano");
        String data= sc.next();
        System.out.println("Eu, "+ nome+ ", morando no endereço "+ endereco+ ", confirmo que recebi o salario de R$"+ salario+ ", na data de "+ data);
    }
}
