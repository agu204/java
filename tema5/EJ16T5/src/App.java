import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int numero;
    boolean esPrimo;
    int i;
    Scanner s = new Scanner(System.in);
    System.out.print("Dime un numero: ");
    numero = Integer.parseInt(s.nextLine());
        s.close();
    esPrimo= true;
    
    for (i=2 ; i<numero ; i++) {
        if ((numero % i) == 0) {
        esPrimo = false;
        }
    }
    
    if (esPrimo) {
        System.out.println(numero+" Es primo.");
    } else {
        System.out.println(numero+" No es primo.");
    }

    
    }
}