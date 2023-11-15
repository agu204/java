import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int i;
        int primero=0;
        int segundo=1;
        int num;
        int lista=0;

        System.out.println("Dime un numero y te mostrare los primeros numeros que me digas");
        Scanner s = new Scanner(System.in);
        num = Integer.parseInt(s.nextLine());
        s.close();
        System.out.print(primero+" ");
        for(i=2;i<=num;i++){
            primero = segundo;
            segundo = lista;
            lista = primero +segundo;
            System.out.print(lista+" ");
        }
    }
}
