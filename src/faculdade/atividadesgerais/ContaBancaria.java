package faculdade.atividadesgerais;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo= saldo;
    }

    public void depositar(double valor){
        saldo+=valor;
    }

    public void sacar(double valor){
        if(valor<=saldo){
            saldo-=valor;
        }
        else{
            System.out.println("Saldo Insuficiente!");
        }
    }
    public double verSaldo(){
        return saldo;
    }
}

