import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int altura;
        int i;

        System.out.print("Dime la altura de la (L): ");
        Scanner s = new Scanner(System.in);
        altura = Integer.parseInt(s.nextLine());
        s.close();
        
        for(i=1;i<altura;i++){
            System.out.println("*");
        }
        for(i=0;i<=(altura/2);i++){
            System.out.print("*");
        }

    }
}
