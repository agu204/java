import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int valor1;
        int valor2;
        int suma; 
        int resta;
        int mult;
        int div;

        System.out.println("Dime dos numeros para que realize todas las operaciones: ");
        Scanner s = new Scanner(System.in);
        valor1 = Integer.parseInt(s.nextLine());
        valor2 = Integer.parseInt(s.nextLine());

        suma = valor1 + valor2;
        resta = valor1 - valor2;
        mult = valor1 * valor2;
        div = valor1 / valor2;

        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El resultado de la resta es "+resta);
        System.out.println("El resultado de la multiplicaion es "+mult);
        System.out.println("El resultaado de la division "+div);

    }
}
