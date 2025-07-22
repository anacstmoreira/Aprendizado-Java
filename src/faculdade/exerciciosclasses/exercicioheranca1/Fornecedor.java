package faculdade.exerciciosclasses.exercicioheranca1;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, int numero, double credito) {
        super(nome, endereco, numero);
        this.valorCredito= credito;
    }

    public double obterSaldo(){
        if(valorCredito>=valorDivida){
            return valorCredito-valorDivida;
        }else{
            System.out.println("Valor insuficiente");
            return valorCredito;
        }
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}