package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1= new Carro();
        Carro carro2= new Carro();

        carro1.nome= "Corola";
        carro1.modelo= "XLM Branco";
        carro1.ano= 2006;

        carro2.nome= "Mustang";
        carro2.modelo= "R3M Verde";
        carro2.ano= 2024;

        System.out.println("----Carro 1\nNome:"+carro1.nome+"\nModelo:"+carro1.modelo+"\nAno:"+carro1.ano);
        System.out.println("----------------");
        System.out.println("----Carro 2\nNome:"+carro2.nome+"\nModelo:"+carro2.modelo+"\nAno:"+carro2.ano);
    }
}
