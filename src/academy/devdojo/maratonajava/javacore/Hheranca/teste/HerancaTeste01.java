package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco= new Endereco("Rua Lourdes", "1234112");
        Pessoa pessoa1= new Pessoa("Ana", "123213", endereco);
        pessoa1.imprime();

        System.out.println("-------------");

        Endereco endereco1= new Endereco("Rua Sao Paulo", "12344412");
        Funcionario funcionario = new Funcionario("Otavo", "11111111", endereco1, 1111);
        funcionario.imprime();
        System.out.println(" ");
        funcionario.relatorioSalario();
    }
}
