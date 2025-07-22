package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Nyo";
        nomes[1] = "Bella";
        nomes[2] = "Nyella";
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        for (int i= 0; i< nomes.length; i++){
            System.out.println(nomes[i]);
        }

        for(String num : nomes){
            System.out.println(num);
        }
    }
}
