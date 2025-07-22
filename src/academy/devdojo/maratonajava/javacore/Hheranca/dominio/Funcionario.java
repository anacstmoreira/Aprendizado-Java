package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Bloco estatico de inicializaçao em funcionario");
    }
    {
        System.out.println("Bloco de inicializaçao em funcionario 1");
    }
    {
        System.out.println("Bloco de inicializaçao em funcionario 2");
    }


    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario= salario;
    }
    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf);
        this.salario= salario;
    }

    public void imprime(){
        super.imprime();
        System.out.printf("Salario: R$%.2f", this.salario);
    }

    public void relatorioSalario(){
        System.out.println("Eu, "+ this.nome+ " recebi o pagamento de " + this.salario + " reais");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
