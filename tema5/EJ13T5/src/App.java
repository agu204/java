import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int i;
        int contadorPositivo=0;
        int contadorNegativo=0;
        int numero;
        System.out.println("Dime 10 nuemros negativos o positivos");
        Scanner s = new Scanner(System.in);

        for(i=1;i<=10;i++){
            numero = Integer.parseInt(s.nextLine());
            if (numero>=0){
                contadorPositivo++;

            }else {
                contadorNegativo++;
            }
            
        }
        System.out.println("Has introducido "+contadorPositivo+" numeros positivos y "+contadorNegativo+" negativos.");
        
    }
}
