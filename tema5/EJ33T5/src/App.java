import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese la altura de la letra U: ");
        int altura = Integer.parseInt(s.nextLine());
        
        for (int i = 0; i < altura - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < altura - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        System.out.print(" ");
        for (int i = 0; i < altura - 2; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
