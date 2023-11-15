import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int contador = 0;
        int numero;
        int aux=0;
        Scanner s = new Scanner(System.in);

        
        System.out.print("Ingrese un número: ");
        numero = Integer.parseInt(s.nextLine());

        aux=numero;
        while(numero !=0){
            numero = numero/10;
            contador++;

        }
        System.out.println("El número " + aux + " tiene " + contador + " dígitos.");
        s.close();
    }

}
