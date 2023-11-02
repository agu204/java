import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int hora;
        System.out.println("Dime una hora para que te responda: ");
        Scanner s = new Scanner(System.in);
        hora = Integer.parseInt(s.nextLine());

        if((hora >= 0)&&(hora <=24)){
            if((hora >= 6)&&(hora <= 12)){
            System.out.println("BUENOS DIAS");

            }else{
                if((hora >= 13)&&(hora <= 20)){
                System.out.println("BUENAS TARDES");

                }else{
                    if((hora >= 21)||(hora <= 5)){
                        System.out.println("BUENAS NOCHES");
                    s.close();
                    }
                }   
            }
        }else {
            System.out.println("ERROR");  
    }
    } 
}