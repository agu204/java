import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int i;
        int altura;
        int j;
        int k;
        int x;
        Scanner s = new Scanner(System.in);

        System.out.print("Dime la altura: ");
        altura = Integer.parseInt(s.nextLine());

        for (i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco
            for (j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir números en orden ascendente
            for ( k = 1; k <= i; k++) {
                System.out.print(k);
                
            }

            // Imprimir números en orden descendente
            for ( x = i - 1; x >= 1; x--) {
                System.out.print(x);
                
            }

            System.out.println(); 
        }
    }
}