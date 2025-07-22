package faculdade.exercicioscondicionais;
import java.util.*;
public class EDS12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----MENU-----");
        System.out.println("1-Filé Mignon ao Molho Madeira\n2-Risoto de Camarão com Limão Siciliano\n3-Salmão Grelhado com Purê de Batata-doce\n4-Frango ao Curry com Arroz de Coco\n5-Lasanha de Berinjela à Bolonhesa\n6-Sair");
        int numero = sc.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Voce escolheu Filé Mignon ao Molho Madeira, a cozinha recebeu seu pedido!");
                System.out.println("Agora é apenas aguardar :)");
                break;
            case 2:
                System.out.println("Voce escolheu Risoto de Camarão com Limão Siciliano, a cozinha recebeu seu pedido!");
                System.out.println("Agora é apenas aguardar :)");
                break;
            case 3:
                System.out.println("Voce escolheu Salmão Grelhado com Purê de Batata-doce, a cozinha recebeu seu pedido!");
                System.out.println("Agora é apenas aguardar :)");
                break;
            case 4:
                System.out.println("Voce escolheu Frango ao Curry com Arroz de Coco, a cozinha recebeu seu pedido!");
                System.out.println("Agora é apenas aguardar :)");
                break;
            case 5:
                System.out.println("Voce escolheu Lasanha de Berinjela à Bolonhesa, a cozinha recebeu seu pedido!");
                System.out.println("Agora é apenas aguardar :)");
                break;
            case 6:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}