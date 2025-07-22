package faculdade.exerciciosclasses.exercicioheranca1;
public class Teste03 {
    public static void main(String[] args) {
        Administrador admin = new Administrador("João", "Av. Central, 123", 10, 3, 3000, 7.5, 800);
        System.out.println(admin.getNome());
        System.out.println(admin.getEndereco());
        System.out.println(admin.getNumero());
        System.out.println(admin.getCodigoSetor());
        System.out.println(admin.getSalarioBase());
        System.out.println(admin.getImposto());
        System.out.println(admin.getAjudaDeCusto());
        System.out.println("Salário Final: R$" + admin.calcularSalario());
    }
}