package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente2 {
    private String nome;
    PlanoAssinatura planoAssinatura;

    public Cliente2(String nome, PlanoAssinatura planoAssinatura) {
        this.nome = nome;
        this.planoAssinatura = planoAssinatura;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome +
                "\nPlano: " + planoAssinatura.name() +
                " - R$" + planoAssinatura.VALOR + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PlanoAssinatura getPlanoAssinatura() {
        return planoAssinatura;
    }

    public void setPlanoAssinatura(PlanoAssinatura planoAssinatura) {
        this.planoAssinatura = planoAssinatura;
    }
}
