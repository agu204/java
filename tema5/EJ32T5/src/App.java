import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        long numero;
        long digito;
        int suma=0;
        long numeroAlReves=0;
        System.out.print("Por favor, introduzca un número entero positivo: ");

        Scanner s = new Scanner(System.in);
        numero = Long.parseLong(s.nextLine());
        s.close();

        System.out.print("Digitos: ");

        while (numero != 0) {
            digito = numero % 10;
            numeroAlReves = numeroAlReves * 10 + digito;
            numero /= 10;
        }
        digito=0;
        
        while (numeroAlReves != 0) {
            digito = numeroAlReves % 10;
            if(digito%2==0){
            System.out.print( + digito+" ");
            suma+=digito;
            }
            numeroAlReves = numeroAlReves / 10;
            
        }
        System.out.println("");
        System.out.println("La suma es : "+suma);
    }
}
