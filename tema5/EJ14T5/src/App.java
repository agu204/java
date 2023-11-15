import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int base;
        int exponente;
        int aux=0;
        int i;

        System.out.println("Dime una base y un exponente");

        Scanner s = new Scanner(System.in);
        System.out.println("Base: ");
        base = Integer.parseInt(s.nextLine());
        System.out.println("Exponente positivo y entero: ");
        exponente = Integer.parseInt(s.nextLine());
        s.close();
        aux=base;

        for(i=1;i<exponente;i++){ 
            aux=aux*base;
        }
        System.out.println("El resultado es " +aux);
    }
}
