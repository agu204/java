import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        int aux =0;
        double cuadrado=0;
        double cubo=0;
        System.out.println("Dime un numero y te dire el cubo y el cuadrado de los 5 siguientes: ");
        Scanner s = new Scanner(System.in);
        numero = Integer.parseInt(s.nextLine());
        aux=numero+5;
        System.out.println("NUMERO     CUADRADO      CUBO ");
        System.out.println("___________________________________");
        do {
            numero=numero+1;
            cuadrado=Math.pow(numero, 2);
            cubo=Math.pow(numero, 3);
            System.out.printf("%-1s    %10.0f   %10.0f\n", numero,cuadrado,cubo);
        } while (numero<aux);
        System.out.println("___________________________________");

        s.close();
    }
}
