import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        int suma=1;
        int i;
        System.out.println("Dime un numero");
        Scanner s = new Scanner(System.in);
        numero = Integer.parseInt(s.nextLine());
        s.close();

        for(i=2; i<=numero;i++){
            suma=suma*i;
        }

        System.out.println(numero +"! = "+suma);
    }
}
