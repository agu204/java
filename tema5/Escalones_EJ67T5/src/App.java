import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el número de escalones: ");
    int escalones = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca la altura de cada escalón: ");
    int alturaEscalon = Integer.parseInt(s.nextLine());
    s.close();
    for (int i = 1; i <= escalones; i++) {
      for (int j = 1; j <= alturaEscalon; j++) {
        for (int k = 0; k < i; k++) {
          System.out.print("****");
        }
        System.out.println();
      }
    }
  }

}