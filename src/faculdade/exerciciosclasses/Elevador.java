package faculdade.exerciciosclasses;

import java.util.Scanner;

public class Elevador {
    private int andar_atual;
    private int[] total_andares;
    private int pessoas_elevador;
    private int capacidade_elevador;

    public Elevador(int total_andares, int capacidade_elevador) {
        this.total_andares = new int[total_andares+1];
        this.capacidade_elevador = capacidade_elevador;
        this.pessoas_elevador= 0;
        this.andar_atual= 0;
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("O que deseja fazer?");
        System.out.println("[1] Adicionar uma pessoa");
        System.out.println("[2] Tirar uma pessoa");
        System.out.println("[3] Subir um andar");
        System.out.println("[4] Descer um andar");
        System.out.println("[5] Encerrar programa.");
        int decisao = sc.nextInt();
        switch (decisao) {
            case 1:
                entrar();
                break;
            case 2:
                sair();
                break;
            case 3:
                subir();
                break;
            case 4:
                descer();
                break;
            case 5:
                System.out.println("Encerrado.");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void entrar(){
        if(pessoas_elevador>=capacidade_elevador){
            System.out.println("-------------------");
            System.out.println("Elevador está cheio!");
        }else {
            System.out.println("-------------------");
            System.out.println("1 pessoa entrou.");
            pessoas_elevador+=1;
        }
        System.out.println("Pessoas no elevador: "+ pessoas_elevador + "/" + capacidade_elevador);
        System.out.println("Andar: "+ andar_atual + "/" + (total_andares.length-1));
        menu();
    }

    public void sair(){
        if(pessoas_elevador<=0){
            System.out.println("-------------------");
            System.out.println("Não tem ninguém no elevador!");
        }else {
            System.out.println("-------------------");
            System.out.println("1 pessoa saiu.");
            pessoas_elevador-=1;
        }
        System.out.println("Pessoas no elevador: "+ pessoas_elevador + "/" + capacidade_elevador);
        System.out.println("Andar: "+ andar_atual + "/" + (total_andares.length-1));
        menu();
    }

    public void subir(){
        if(andar_atual>=total_andares.length-1){
            System.out.println("-------------------");
            System.out.println("Está no ultimo andar!");
        }else{
            System.out.println("-------------------");
            System.out.println("Subiu 1 andar!");
            andar_atual+=1;
            System.out.println("Pessoas no elevador: "+ pessoas_elevador + "/" + capacidade_elevador);
            System.out.println("Andar: "+ andar_atual + "/" + (total_andares.length-1));
        }
        menu();
    }

    public void descer() {
        if (andar_atual <= 0) {
            System.out.println("-------------------");
            System.out.println("Você já está no térreo!");
        } else {
            andar_atual -= 1;
            System.out.println("-------------------");
            System.out.println("Desceu 1 andar.");
            System.out.println("Pessoas no elevador: "+ pessoas_elevador + "/" + capacidade_elevador);
            System.out.println("Andar: "+ andar_atual + "/" + (total_andares.length-1));
        }
        menu();
    }

    public int getAndar_atual() {
        return andar_atual;
    }

    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }

    public int[] getTotal_andares() {
        return total_andares;
    }

    public void setTotal_andares(int[] total_andares) {
        this.total_andares = total_andares;
    }

    public int getPessoas_elevador() {
        return pessoas_elevador;
    }

    public void setPessoas_elevador(int pessoas_elevador) {
        this.pessoas_elevador = pessoas_elevador;
    }

    public int getCapacidade_elevador() {
        return capacidade_elevador;
    }

    public void setCapacidade_elevador(int capacidade_elevador) {
        this.capacidade_elevador = capacidade_elevador;
    }
}