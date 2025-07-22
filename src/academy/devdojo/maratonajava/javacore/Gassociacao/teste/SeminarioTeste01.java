package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Rua 1231");
        Aluno aluno = new Aluno("Nyo", 18);
        Professor professor = new Professor("Celma","Biologia");
        Aluno[] alunosParaSeminario= {aluno};
        Seminario seminario= new Seminario("Biologia da Vida", local, alunosParaSeminario);
        Seminario[] seminariosDisponiveis= {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
