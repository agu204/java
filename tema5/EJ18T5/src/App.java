import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero1;//para el menor
        int numero2;//para el mayor
        int aux;

        System.out.print("Dime dos numeros enteros positivos y distintos: "); 
        Scanner s = new Scanner(System.in);
        do{
            numero1 = Integer.parseInt(s.nextLine());
            if(numero1>0){
                System.out.print("Primer numero correcto dime el segundo: ");
            }else{
                System.out.print("El valor introducido es negativo. Pon otro numero: ");
            }

        }while(!(numero1>=0));

        do{
            numero2 = Integer.parseInt(s.nextLine());
            if((numero2>0)&&(!(numero2==numero1))){
                System.out.println("Segundo numero correcto. ");
                System.out.println("Solucion: ");
            }else{
                System.out.print("El valor introducido es negativo o igual al anterior. Pon otro numero: ");
            }
        }while(!(numero2>=0)||((numero2==numero1)));
        
        s.close();

        if(numero2<numero1){
            aux=numero1;
            numero1=numero2;
            numero2=aux;
        }
        for(int i=numero1;i<=numero2;i=i+7){
            System.out.print(i+" ");
        }
    }
}
