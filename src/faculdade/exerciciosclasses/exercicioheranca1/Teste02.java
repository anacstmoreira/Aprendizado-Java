package faculdade.exerciciosclasses.exercicioheranca1;

public class Teste02 {
    public static void main(String[] args) {
        Empregado em1= new Empregado("Ana", "Rua tal", 12314, 3, 2000, 8.5);
        double salario= em1.calcularSalario();
        System.out.println(salario);
    }
}
