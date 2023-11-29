/*Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero1;
        int numero2;
        int i;
        System.out.println("Dime dos numeros:");
        Scanner s =new Scanner(System.in);
        
        System.out.print("Primer numero: ");
        numero1 = Integer.parseInt(s.nextLine());
        System.out.print("Segundo numero: ");
        numero2= Integer.parseInt(s.nextLine());
        s.close();
        System.out.print("Solucion: ");
        for(i=numero1; i>0;i--){
                if(i%numero2==0){
                    System.out.print(i+" ");
                }else{
                
                }
        }
    }
}
