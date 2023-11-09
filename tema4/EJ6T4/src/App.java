import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int altura;
        double g = 9.81;
        double tiempo = 0;
        System.out.println("Dime la altura en metros a la cae el objeto y te dire cuanto tarda");
        Scanner s = new Scanner(System.in);
        altura = Integer.parseInt(s.nextLine());
        if(altura>0){
        tiempo=2*altura;
        tiempo=tiempo/g;
        tiempo=Math.sqrt(tiempo);
        System.out.println("El objeto tarda en caer "+tiempo+ " S80egundos");
        }else {
            System.out.println("No puedes introducir una altura negativa");
        }

        s.close();
    }
}
