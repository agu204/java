import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int altura;
        int i;
        int j;
        char caracter;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime la altura de la pirámide: ");
        altura = scanner.nextInt();

        System.out.print("Dime el carácter de la pirámide: ");
        caracter = scanner.next().charAt(0);

        for (i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco a la izquierda
            for (j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            // Imprimir el carácter solo en los bordes
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == altura) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            // Cambiar de línea después de cada nivel de la pirámide
            System.out.println();
        }
        scanner.close();
    }
}
