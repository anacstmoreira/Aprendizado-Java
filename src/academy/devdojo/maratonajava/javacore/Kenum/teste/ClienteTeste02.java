package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente2;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.PlanoAssinatura;

public class ClienteTeste02 {
    public static void main(String[] args) {
        Cliente2 cliente1= new Cliente2("Bel", PlanoAssinatura.PREMIUM);
        Cliente2 cliente2= new Cliente2("Nyo", PlanoAssinatura.BASICO);
        Cliente2 cliente3= new Cliente2("Tunia", PlanoAssinatura.PADRAO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
