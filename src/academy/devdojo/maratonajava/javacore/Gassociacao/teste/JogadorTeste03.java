package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Nyo");
        Jogador jogador2 = new Jogador("Bella");
        Time time = new Time("Gatitos");
        Jogador[] jogadores= {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("------Jogador------");
        jogador.imprime();
        System.out.println("------Time------");
        time.imprime();
    }
}
