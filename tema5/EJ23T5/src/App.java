import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int suma=0;     
        int numero;
        int contador=0;
        int media=0;

        System.out.println("Introduce numeros parare cuando llegues a una cantidad total de 10000");
        Scanner s =new Scanner(System.in);
        
        do{
            numero = Integer.parseInt(s.nextLine());
            contador++;
            suma+=numero;
        }while(suma<10000);
        s.close();

        media=suma/contador;

        System.out.println("La suma total es "+suma);
        System.out.println("Has introducido un total de "+contador+" numeros");
        System.out.println("La media es "+media);
    }

}
