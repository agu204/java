import java.util.Scanner;


public class App {
  
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número entero (mayor que cero): ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());

    int numero = numeroIntroducido;
    int volteado = 0;
    boolean numeroComido = false;
    
    // Al mismo tiempo que se le da la vuelta al número
    // se le quitan los 0s y 8s
    while (numero > 0) {
      if ((numero % 10 != 0) && (numero % 10 != 8)) {
        volteado = (volteado * 10) + (numero % 10);
      } else {
        numeroComido = true;
      }
      numero /= 10;
    }
s.close();
    // Se le vuelve a dar la vuelta al número
    numero = volteado;
    volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }

    if (numeroComido) {
      System.out.print("Después de haber sido comido por el gusano numérico");
      System.out.println(" se queda en " + volteado + ".");
    } else {
      System.out.println("El gusano numérico no se ha comido ningún dígito.");
    }
  }
}