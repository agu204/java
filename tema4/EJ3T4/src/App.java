import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        System.out.println("Dime un numero del 1 al 7 y te dire con que dia de la semana corresponde");
        Scanner s = new Scanner(System.in);
        numero =  Integer.parseInt(s.nextLine());
        if ((numero >= 1) && (numero<=7)){
            switch (numero) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                
                case 3:
                    System.out.println("Miercoles");
                    break;
                
                case 4:
                    System.out.println("Jueves");
                    break;
                
                case 5:
                    System.out.println("Viernes");
                    break;
                
                case 6:
                    System.out.println("Sabado");
                    break;
                
                case 7:
                    System.out.println("Domingo");
                    break;

                default:
                    break;
            }
        }else{
            System.out.println("Valor introducido no valido");
        }
        s.close();
    }
    
}
