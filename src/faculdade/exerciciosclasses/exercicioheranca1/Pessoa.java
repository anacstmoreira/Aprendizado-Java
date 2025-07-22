package faculdade.exerciciosclasses.exercicioheranca1;

public class Pessoa {
    private String nome;
    private String endereco;
    private long numero;

    public Pessoa(String nome, String endereco, int numero){
        this.nome= nome;
        this.endereco= endereco;
        this.numero= numero;
    }



    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
}