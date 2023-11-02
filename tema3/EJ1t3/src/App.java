import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    int primernumero;
    int segundonumero;
    int resultado = 0;

    Scanner s = new Scanner(System.in);
    System.out.println("Dime dos numeros y realizaré su multiplicacion: ");
    primernumero = Integer.parseInt(s.nextLine());
    segundonumero = Integer.parseInt(s.nextLine());

    resultado = primernumero * segundonumero;

    System.out.println("El resultado es " + resultado);
  }
}
