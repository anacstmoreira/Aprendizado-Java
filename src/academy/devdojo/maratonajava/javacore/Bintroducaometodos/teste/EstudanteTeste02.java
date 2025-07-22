package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01= new Estudante();
        Estudante estudante02= new Estudante();

        estudante01.nome= "Nyo";
        estudante01.idade= 18;
        estudante01.sexo= 'F';

        estudante02.nome= "Bella";
        estudante02.idade= 21;
        estudante02.sexo= 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
