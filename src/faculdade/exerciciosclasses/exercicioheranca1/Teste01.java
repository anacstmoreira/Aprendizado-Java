package faculdade.exerciciosclasses.exercicioheranca1;

public class Teste01 {
    public static void main(String[] args) {
        Fornecedor f1= new Fornecedor("Vinicius", "Santa Luzia", 31904, 1000);
        f1.setValorDivida(100);
        System.out.println(f1.obterSaldo());
        f1.setValorDivida(1001);
        System.out.println(f1.obterSaldo());
    }
}