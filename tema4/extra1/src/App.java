import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int hora;
        System.out.println("Dime un numero de 0 a 23 y te dire buenos dias/tardes/noches. ");
        Scanner s = new Scanner(System.in);
        hora = Integer.parseInt(s.nextLine());
        if((hora<=-1)||(hora>=25)){
            System.out.println("Error");
        }else if((hora>=6)&&(hora<=12)){
            System.out.println("Buenos Dias");
        }else if((hora>=13)&&(hora<=20)){
            System.out.println("Buenas Tardes");
        }else if((hora<=5)||(hora>=21)){
            System.out.println("Buenas noches");
        }

        s.close();
    }
}
