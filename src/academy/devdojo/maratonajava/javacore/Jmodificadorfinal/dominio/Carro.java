package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE= 250;
    public final Comprador COMPRADOR = new Comprador();

    public Carro(String nome) {
        this.nome = nome;
    }

    //não tem final antes de void então pode ser sobrescrito
    public void imprime(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
