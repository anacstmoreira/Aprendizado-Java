package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor= new Professor("Celma");
        Professor professor2= new Professor("Fernanda");
        Professor[] professores= {professor,professor2};
        Escola escola= new Escola("Tancredo Neves", professores);
        escola.imprime();
    }
}
