import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero=0;
        int contador=0;
        int aux=0;
        int contadorimpares=0;
        double media=0;

        System.out.print("Ve diciendome numeros, cuando introduzcas uno negativo parare: ");
        Scanner s = new Scanner(System.in);
        
        do{
            numero = Integer.parseInt(s.nextLine());
            if(numero>=0){
                contador++;
                    if ((numero % 2) == 0) {
                        if(numero>aux){
                            aux=numero;
                        }

                    }else{
                        contadorimpares++;
                        media+=numero;
                    }
                
            }else{
                System.out.println("Solucion: ");
            }
        }while(numero>=0);
        media=media/contadorimpares;
        System.out.println("El total de numero introducidos a sido "+contador);
        System.out.printf( "La media de los numeros impares es: %.1f\n ", media);
        if(!(aux==0)){
        System.out.println("El numero par mas grande es "+aux);
        }else{
            System.out.println("Ningun numero introducido es par.");
        }
        s.close();
    }
}
