import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int i;
        int altura;
        char caracter;
        int j;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime la altura: ");
        altura = scanner.nextInt();

        System.out.print("Pon el caracter: ");
        caracter = scanner.next().charAt(0);

        for (i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco a la izquierda
            for (j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir el carácter repetido
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print(caracter);
            }

            // Cambiar de línea después de cada nivel de la pirámide
            System.out.println();
        }

        
        scanner.close();
    }
}
