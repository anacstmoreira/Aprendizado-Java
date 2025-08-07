package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class ContaBancaria {
    private final int NUMERO_CONTA;
    private double saldo;

    public ContaBancaria(int NUMERO_CONTA, double saldo) {
        this.NUMERO_CONTA = NUMERO_CONTA;
        this.saldo = saldo;
    }

    public final void mostrarSaldo(){
        System.out.println(saldo);
    }

    public int getNUMERO_CONTA() {
        return NUMERO_CONTA;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}