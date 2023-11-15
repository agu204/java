import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        int i;
        int aux=0;
        int suma=0;
        Scanner s = new Scanner(System.in);

        System.out.println("Dime un numero entero y positivo");
        do {
            numero = Integer.parseInt(s.nextLine());
        } while (!(numero>0));
        s.close();

        aux=numero;
        aux+=100;
        for(i=numero;i<aux;i++){
            suma+=i;
        }
        System.out.println("Solucion: "+suma);

    }

}