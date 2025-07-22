package faculdade.exerciciosclasses.exercicioheranca1;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, int numero, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, numero, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto= ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
