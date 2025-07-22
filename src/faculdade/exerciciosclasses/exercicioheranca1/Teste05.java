package faculdade.exerciciosclasses.exercicioheranca1;

public class Teste05 {
    public static void main(String[] args) {
        Operario operario = new Operario("Carlos", "Rua das Flores", 15, 2, 2500.0, 10.0, 8000.0, 5.0);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Salário Base: R$" + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor da Produção: R$" + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário Final: R$" + operario.calcularSalario());
    }
}
