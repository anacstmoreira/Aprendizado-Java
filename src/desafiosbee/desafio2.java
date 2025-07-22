package desafiosbee;

//Uma empresa tem 150 caminhões, cada caminhão transporta 2400kg de areia ao mês.Para cada caminhão tem 3 caminhoneiros,
//cada caminhoneiro tem um salário fixo de 5.000R$ ao mês, cada caminhoneiro só pode trabalhar 3 dias na semana.
// Faça a soma de quantos caminhoneiros tem na empresa e o valor total que a empresa terá que pagar para todos caminhoneiros
// ao ano. Faça também a média de quantos kg de areia cada caminhoneiro transporta ao ano.

import java.util.*;
public class desafio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total_de_caminhoneiros, salario_ao_ano, media_kg__ano, caminhoes, mediamesalkg, salariomensal, salarioanual,areiacaminhao;
        caminhoes=150;
        areiacaminhao=2400;
        salariomensal= 5000;
        mediamesalkg=areiacaminhao*caminhoes;
        total_de_caminhoneiros= caminhoes*3;
        System.out.println("Para calcularmos a quantidade de caminhoneiros pegamos o total de caminhoes(150) e multiplicamos por 3 \npois em cada caminhao h[a 3 funcionarios na semana.");
        System.out.println("Logo: 150 * 3 = 450 funcionarios");
        System.out.println("Tendo 450 funcionarios, para calcularmor o salario anual que a empresa deve pagar, primeiro calculamos \no salario mensal a ser pago.");
        System.out.println("Dito isso, faremos R$5.000 * 450 funcionarios = R$2.250.000");

    }
}
