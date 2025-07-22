package desafiosbee;
import java.util.*;
public class dsf1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tipo_de_cha, t1,t2,t3,t4,t5,acertos,contador;
        System.out.println("Coloque o tipo do chá:");
        tipo_de_cha= sc.nextInt();
        System.out.println("Coloque os chutes em apenas uma linha:");
        t1= sc.nextInt();
        t2= sc.nextInt();
        t3= sc.nextInt();
        t4= sc.nextInt();
        t5= sc.nextInt();
        acertos=0;
        contador=0;
        while(contador<5){
            if (t1>=1 && t1<=4){
                if (t1==tipo_de_cha){
                    acertos++;
                    contador++;
                }
            }
            if (t2>=1 && t2<=4){
                if (t2==tipo_de_cha){
                    acertos++;
                    contador++;
                }
            }
            if (t3>=1 && t3<=4){
                if (t3==tipo_de_cha){
                    acertos++;
                    contador++;
                }
            }
            if (t4>=1 && t4<=4){
                if (t4==tipo_de_cha){
                    acertos++;
                    contador++;
                }
            }
            if (t5>=1 && t5<=4){
                if (t5==tipo_de_cha){
                    acertos++;
                    contador++;
                }
            }
        }
        System.out.println(acertos);
    }
}
