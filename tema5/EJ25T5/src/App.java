import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int numero;
    int numeroAlReves = 0;
    int digito;

    Scanner s = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        numero = Integer.parseInt(s.nextLine());

        while (numero != 0) {
            digito = numero % 10;
            numeroAlReves = numeroAlReves * 10 + digito;
            numero /= 10;
        }
        s.close();

        System.out.println("El número al revés es: " + numeroAlReves);
    }
}
