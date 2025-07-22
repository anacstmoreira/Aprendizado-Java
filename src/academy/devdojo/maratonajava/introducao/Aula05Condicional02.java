package academy.devdojo.maratonajava.introducao;

public class Aula05Condicional02 {
    public static void main(String[] args) {
        double salario= 3000;
        String mensagemDoar= "Eu vou doar 500 reais";
        String mensagemNaoDoar= "Eu não vou doar";
        //(codição) ? verdadeiro : falso
        String resultado= salario>5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
