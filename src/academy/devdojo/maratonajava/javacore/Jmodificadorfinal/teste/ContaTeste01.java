package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.ContaBancaria;

public class ContaTeste01 {
    public static void main(String[] args) {
        ContaBancaria conta= new ContaBancaria(123, 1000);
        System.out.println(conta.getSaldo());
        System.out.println(conta.getNUMERO_CONTA());
        conta.setSaldo(2000);
        System.out.println(conta.getNUMERO_CONTA());
        System.out.println(conta.getSaldo());

    }
}
