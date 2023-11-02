import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double resultado = 0;
        double euros;
        double pesetas = 166.386;

        

        System.out.println("Dime la cantidad de euros que convierta apesetas: ");
        Scanner s = new Scanner(System.in);
        euros = Integer.parseInt(s.nextLine());

        resultado = euros * pesetas;

        System.out.println("El resultado es: "+resultado+" pesetas");
    }
}
