package faculdade.exerciciosrepetçao;
public class ex13 {
    public static void main(String[] args) {
        int polegada=1;
        double cent= 0;
        while(polegada<=20){
            cent= polegada*2.54;
            System.out.println("Polegada= "+ polegada);
            System.out.printf("Centimetro= %.2f",cent);
            System.out.println("\n-------------------");
            polegada=polegada+1;
        }
    }
}
//não sei se tá certo mas foi o que entendi