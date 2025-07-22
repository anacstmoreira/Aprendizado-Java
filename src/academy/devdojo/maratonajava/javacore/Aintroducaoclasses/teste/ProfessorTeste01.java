package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor= new Professor();
        professor.nome= "Samurai";
        professor.idade= 30;
        professor.sexo= 'M';

        System.out.println("Nome: "+professor.nome + "\nIdade: "+ professor.idade+ "\nSexo: "+ professor.sexo);
    }
}
