import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int pass;
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Dime la combinacion de la caja fuerte");
        for(i=0;i<4;i++){
            pass = Integer.parseInt(s.nextLine());
            if (pass==1234){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }else{
                System.out.println("Lo siento, esa no es la combinación");

            }
        s.close();
        }
    }
}
