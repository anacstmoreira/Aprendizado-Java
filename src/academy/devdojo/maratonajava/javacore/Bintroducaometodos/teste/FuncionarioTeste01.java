package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario= new Funcionario();

        funcionario.setNome("Joao");
        funcionario.setIdade(19);
        funcionario.setSalarios(new double[]{1231,3123,1131});

        funcionario.imprimeDados();
        System.out.println("Média: "+ funcionario.getMedia());
    }
}
