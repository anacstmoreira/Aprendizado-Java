package academy.devdojo.maratonajava.introducao;

public class Aula06Repeticao {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            System.out.println("For "+i);
        }

        int contador=0;
        do{
           System.out.println("Oi");
           contador++;
        }while(contador<10);

        int contador2=0;
        while(contador2<10){
            System.out.println("Oi"+contador2);
            contador2++;
        }
    }
}
