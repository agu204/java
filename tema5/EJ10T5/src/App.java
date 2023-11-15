import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero=0;
        int suma =0;
        int media = 0;
        int contador =0;
        System.out.println("Dime numeros positivos y te calculare la media para parar solo introduce un numero negativo");
        Scanner s = new Scanner(System.in);
        
        do {
            numero = Integer.parseInt(s.nextLine());
            if((numero>=0)&&(numero<=10)){
                System.out.println("Introduzca numero: ");
                suma = suma +numero;
                contador++;
            }else {
                System.out.println("Numero introducido nu valido");
            }   
        } while (numero>=0);
        media = suma /contador;
        System.out.println(+suma);
        System.out.println(+contador);
        System.out.println("La media es "+media);
    s.close();
    }
}
