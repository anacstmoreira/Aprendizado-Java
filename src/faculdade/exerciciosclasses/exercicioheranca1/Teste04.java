package faculdade.exerciciosclasses.exercicioheranca1;

public class Teste04 {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Mariana", "Av. das Vendas", 222, 3,
                2500.0, 8.0, 20000.0, 10.0);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Salário Base: R$" + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor de Vendas: R$" + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("Salário Final: R$" + vendedor.calcularSalario());
    }
}
