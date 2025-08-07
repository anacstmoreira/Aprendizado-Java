package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum PlanoAssinatura {
    BASICO(29.90),
    PADRAO(49.90),
    PREMIUM(79.90);
    public final double VALOR;

    PlanoAssinatura(double VALOR) {
        this.VALOR = VALOR;
    }

}
